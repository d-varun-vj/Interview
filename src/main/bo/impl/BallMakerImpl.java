package main.bo.impl;

import main.bo.BallMaker;
import main.db.BonusTypeDao;
import main.dto.Ball;
import main.dto.enums.BonusType;
import main.dto.enums.PlayerChoice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BallMakerImpl implements BallMaker {

    private final BonusTypeDao bonusTypeDao;

    public BallMakerImpl(BonusTypeDao bonusTypeDao) {
        this.bonusTypeDao = bonusTypeDao;
    }

    @Override
    public List<Ball> ballMaker(PlayerChoice choice) {
        if (null != choice) {
            // This data is stored in DB so that any future changes made to it should not break the code.
            Map<Integer, BonusType> bonusTypeMap = bonusTypeDao.bonusData(choice);
            List<Ball> balls = new ArrayList<>(7);
            for (int i = 0; i < 7; i++) {
                var ball = new Ball(bonusTypeMap.get(i), i + 1);
                balls.add(ball);
            }
            return balls;
        } else {
            return Collections.emptyList();
        }
    }

}
