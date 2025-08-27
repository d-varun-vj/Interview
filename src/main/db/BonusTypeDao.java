package main.db;

import main.dto.enums.BonusType;
import main.dto.enums.PlayerChoice;

import java.util.Map;

public interface BonusTypeDao {
    Map<Integer, BonusType> bonusData(PlayerChoice choice);
}
