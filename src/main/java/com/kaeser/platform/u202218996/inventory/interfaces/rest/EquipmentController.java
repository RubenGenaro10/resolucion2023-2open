package com.kaeser.platform.u202218996.inventory.interfaces.rest;

import com.kaeser.platform.u202218996.inventory.application.command.CreateEquipmentCommand;
import com.kaeser.platform.u202218996.inventory.domain.aggregates.Equipment;
import com.kaeser.platform.u202218996.inventory.infrastructure.persistence.EquipmentRepository;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.resources.CreateEquipmentResource;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.resources.EquipmentResource;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.transform.CreateEquipmentCommandFromResourceAssembler;
import com.kaeser.platform.u202218996.inventory.interfaces.rest.transform.EquipmentResourceFromEntityAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/equipments")
public class EquipmentController {

    private final EquipmentRepository equipmentRepository;

    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @PostMapping
    public ResponseEntity<EquipmentResource> createEquipment(@RequestBody CreateEquipmentResource resource) {
        CreateEquipmentCommand command = CreateEquipmentCommandFromResourceAssembler.toCommandFromResource(resource);
        Equipment equipment = new Equipment();
        equipment.setModel(command.model());
        equipment.setEquipmentType(command.equipmentType());
        equipmentRepository.save(equipment);

        EquipmentResource equipmentResource = EquipmentResourceFromEntityAssembler.toResourceFromEntity(equipment);
        return new ResponseEntity<>(equipmentResource, HttpStatus.CREATED);
    }
}

