package main.bo;

import main.dto.Ball;
import main.dto.enums.PlayerChoice;

import java.util.List;

public interface BallMaker {
    List<Ball> ballMaker(PlayerChoice choice);
}
