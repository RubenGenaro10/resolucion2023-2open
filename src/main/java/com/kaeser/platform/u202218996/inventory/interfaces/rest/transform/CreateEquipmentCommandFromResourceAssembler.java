package com.kaeser.platform.u202218996.inventory.interfaces.rest.transform;

import com.kaeser.platform.u202218996.inventory.application.command.CreateEquipmentCommand;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.resources.CreateEquipmentResource;
import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;

public class CreateEquipmentCommandFromResourceAssembler {
    public static CreateEquipmentCommand toCommandFromResource(CreateEquipmentResource resource) {
        return new CreateEquipmentCommand(resource.model(), EquipmentType.valueOf(resource.equipmentType().toUpperCase()));
    }
}
