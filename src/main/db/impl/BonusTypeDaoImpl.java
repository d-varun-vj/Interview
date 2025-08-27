package main.db.impl;

import main.db.BonusTypeDao;
import main.dto.enums.BonusType;
import main.dto.enums.PlayerChoice;

import java.util.Map;

public class BonusTypeDaoImpl implements BonusTypeDao {
    @Override
    public Map<Integer, BonusType> bonusData(PlayerChoice choice) {
        return  Map.of(0, BonusType.BONUS,
                1, BonusType.NO_BONUS,
                2, BonusType.REPLY,
                3, BonusType.BONUS,
                4, BonusType.NO_BONUS,
                5, BonusType.BONUS,
                6, BonusType.BONUS);
    }
}
