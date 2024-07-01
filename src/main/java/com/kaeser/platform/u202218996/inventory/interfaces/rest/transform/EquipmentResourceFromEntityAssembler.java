package com.kaeser.platform.u202218996.inventory.interfaces.rest.transform;

import com.kaeser.platform.u202218996.inventory.domain.aggregates.Equipment;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.resources.EquipmentResource;

public class EquipmentResourceFromEntityAssembler {
    public static EquipmentResource toResourceFromEntity(Equipment entity) {
        return new EquipmentResource(
                entity.getId(),
                entity.getMaterialSerialNumber(),
                entity.getModel(),
                entity.getEquipmentType().toString()
        );
    }
}
