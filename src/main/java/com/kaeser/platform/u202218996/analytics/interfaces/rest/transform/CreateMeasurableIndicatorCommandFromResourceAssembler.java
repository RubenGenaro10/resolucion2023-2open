package com.kaeser.platform.u202218996.analytics.interfaces.rest.transform;

import com.kaeser.platform.u202218996.analytics.application.command.CreateMeasurableIndicatorCommand;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.resources.CreateMeasurableIndicatorResource;
import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;

public class CreateMeasurableIndicatorCommandFromResourceAssembler {
    public static CreateMeasurableIndicatorCommand toCommandFromResource(CreateMeasurableIndicatorResource resource) {
        return new CreateMeasurableIndicatorCommand(
                resource.symbol(),
                resource.description(),
                resource.thresholdMinimum(),
                resource.thresholdMaximum(),
                EquipmentType.valueOf(resource.equipmentType().toUpperCase())
        );
    }
}
