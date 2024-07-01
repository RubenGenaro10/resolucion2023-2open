package com.kaeser.platform.u202218996.inventory.application.command;

import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;

public record CreateEquipmentCommand(String model, EquipmentType equipmentType) {
}


