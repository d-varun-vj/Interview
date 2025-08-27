package main;


import main.bo.BallMaker;
import main.bo.ChoiceMaker;
import main.bo.impl.BallMakerImpl;
import main.bo.impl.ChoiceMakerImpl;
import main.db.impl.BonusTypeDaoImpl;
import main.dto.BonusResult;
import main.dto.enums.PlayerChoice;

public class Main {

    public static void main(String[] args) throws Exception {
        PlayerChoice choice = PlayerChoice.LEFT;
        ChoiceMaker choiceMaker = new ChoiceMakerImpl();
        BallMaker ballMaker = new BallMakerImpl(new BonusTypeDaoImpl());
        var balls = ballMaker.ballMaker(choice);
        BonusResult bonusResult = choiceMaker.choice(balls);
        System.out.println("Result: columnNumber: " + bonusResult.getColumnNumber() + " bonusType: " + bonusResult.getBonusType().name());
    }
}