package main.dto;

import main.dto.enums.BonusType;

public class BonusResult {
    private final Integer columnNumber;
    private final BonusType bonusType;

    public BonusResult(Integer columnNumber, BonusType bonusType) {
        this.columnNumber = columnNumber;
        this.bonusType = bonusType;
    }

    public Integer getColumnNumber() {
        return columnNumber;
    }

    public BonusType getBonusType() {
        return bonusType;
    }
}

