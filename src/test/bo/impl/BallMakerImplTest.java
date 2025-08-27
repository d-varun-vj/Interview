package test.bo.impl;

import main.bo.BallMaker;
import main.bo.impl.BallMakerImpl;
import main.db.BonusTypeDao;
import main.db.impl.BonusTypeDaoImpl;
import main.dto.Ball;
import main.dto.enums.PlayerChoice;

import java.util.List;

public class BallMakerImplTest {
    public static void main(String[] args) {
        BonusTypeDao bonusTypeDao = new BonusTypeDaoImpl();
        BallMaker ballMaker = new BallMakerImpl(bonusTypeDao);

        // Test Case 1 : BallList must not be empty
        List<Ball> ballList = ballMaker.ballMaker(PlayerChoice.LEFT);
        if (ballList.isEmpty()) {
            System.out.println("Test failed, ball list is empty");
        } else {
            System.out.println("Test Success");
        }

        // Test Case 1 : BallList must be empty if playerChoice is null
        List<Ball> emptyList = ballMaker.ballMaker(null);
        if (emptyList.isEmpty()) {
            System.out.println("Test success, ball list is empty");
        } else {
            System.out.println("Test failed");
        }
    }
}
