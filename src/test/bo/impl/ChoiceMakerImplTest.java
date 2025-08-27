package test.bo.impl;

import main.bo.BallMaker;
import main.bo.ChoiceMaker;
import main.bo.impl.BallMakerImpl;
import main.bo.impl.ChoiceMakerImpl;
import main.db.impl.BonusTypeDaoImpl;
import main.dto.BonusResult;
import main.dto.enums.PlayerChoice;

public class ChoiceMakerImplTest {
    public static void main(String[] args) {
        ChoiceMaker choiceMaker = new ChoiceMakerImpl();
        // Test case 1 : if choice null, throw exception
        try {
            BonusResult bonusResult = choiceMaker.choice(null);
            if (null != bonusResult) {
                System.out.println("Test Failed");
            }
        } catch (Exception exception) {
            System.out.println("Test success");
        }

        // Test case 2 : if choice not null, return valid BonusResult
        try {
            BallMaker ballMaker = new BallMakerImpl(new BonusTypeDaoImpl());
            var balls = ballMaker.ballMaker(PlayerChoice.LEFT);
            BonusResult bonusResult = choiceMaker.choice(balls);
            if (null != bonusResult) {
                System.out.println("Test Success");
            } else {
                System.out.println("Test Failed");
            }
        } catch (Exception exception) {
            System.out.println("Test failed");
        }
    }
}
