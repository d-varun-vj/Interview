package main.dto;


import main.dto.enums.BonusType;

public class Ball {
    private BonusType bonusType;
    private Integer columnNumber;

    public Ball(BonusType bonusType, Integer columnNumber) {
        this.bonusType = bonusType;
        this.columnNumber = columnNumber;
    }

    public BonusType getBonusType() {
        return bonusType;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }


}
