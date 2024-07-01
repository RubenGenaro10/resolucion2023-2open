package com.kaeser.platform.u202218996.analytics.interfaces.rest;

import com.kaeser.platform.u202218996.analytics.application.command.CreateMeasurableIndicatorCommand;
import com.kaeser.platform.u202218996.analytics.domain.aggregates.MeasurableIndicator;
import com.kaeser.platform.u202218996.analytics.infrastructure.persistence.MeasurableIndicatorRepository;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.resources.CreateMeasurableIndicatorResource;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.resources.MeasurableIndicatorResource;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.transform.CreateMeasurableIndicatorCommandFromResourceAssembler;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.transform.MeasurableIndicatorResourceFromEntityAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/measurable-indicators")
public class MeasurableIndicatorController {

    private final MeasurableIndicatorRepository measurableIndicatorRepository;

    public MeasurableIndicatorController(MeasurableIndicatorRepository measurableIndicatorRepository) {
        this.measurableIndicatorRepository = measurableIndicatorRepository;
    }

    @PostMapping
    public ResponseEntity<MeasurableIndicatorResource> createMeasurableIndicator(@RequestBody CreateMeasurableIndicatorResource resource) {
        CreateMeasurableIndicatorCommand command = CreateMeasurableIndicatorCommandFromResourceAssembler.toCommandFromResource(resource);
        MeasurableIndicator measurableIndicator = new MeasurableIndicator();
        measurableIndicator.setSymbol(command.symbol());
        measurableIndicator.setDescription(command.description());
        measurableIndicator.setThresholdMinimum(command.thresholdMinimum());
        measurableIndicator.setThresholdMaximum(command.thresholdMaximum());
        measurableIndicator.setEquipmentType(command.equipmentType());
        measurableIndicatorRepository.save(measurableIndicator);

        MeasurableIndicatorResource measurableIndicatorResource = MeasurableIndicatorResourceFromEntityAssembler.toResourceFromEntity(measurableIndicator);
        return new ResponseEntity<>(measurableIndicatorResource, HttpStatus.CREATED);
    }
}

