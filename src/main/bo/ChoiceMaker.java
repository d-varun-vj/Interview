package main.bo;

import main.dto.Ball;
import main.dto.BonusResult;

import java.util.List;

public interface ChoiceMaker {
    BonusResult choice(List<Ball> balls) throws Exception;
}
