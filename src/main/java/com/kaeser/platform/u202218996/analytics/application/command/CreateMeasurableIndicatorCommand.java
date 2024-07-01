package com.kaeser.platform.u202218996.analytics.application.command;

import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;

public record CreateMeasurableIndicatorCommand(String symbol, String description, Double thresholdMinimum, Double thresholdMaximum, EquipmentType equipmentType) {
}
