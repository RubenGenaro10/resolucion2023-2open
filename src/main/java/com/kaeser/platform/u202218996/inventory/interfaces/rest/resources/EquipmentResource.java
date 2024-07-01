package com.kaeser.platform.u202218996.inventory.interfaces.rest.resources;

import java.util.UUID;

public record EquipmentResource(Long id, UUID materialSerialNumber, String model, String equipmentType) {
}
