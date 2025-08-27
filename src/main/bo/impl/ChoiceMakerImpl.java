package main.bo.impl;

import main.bo.ChoiceMaker;
import main.dto.Ball;
import main.dto.BonusResult;

import java.util.List;
import java.util.Random;

public class ChoiceMakerImpl implements ChoiceMaker {
    @Override
    public BonusResult choice(List<Ball> balls) throws Exception {
        if (null == balls || balls.isEmpty()) {
            throw new Exception("Balls cannot be null");
        }
        Random random = new Random();
        Ball ball = balls.get(random.nextInt(6));
        return new BonusResult(ball.getColumnNumber(), ball.getBonusType());
    }
}
