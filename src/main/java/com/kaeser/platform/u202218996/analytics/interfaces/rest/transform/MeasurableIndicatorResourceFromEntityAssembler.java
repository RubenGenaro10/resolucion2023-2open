package com.kaeser.platform.u202218996.analytics.interfaces.rest.transform;

import com.kaeser.platform.u202218996.analytics.domain.aggregates.MeasurableIndicator;
import com.kaeser.platform.u202218996.analytics.interfaces.rest.resources.MeasurableIndicatorResource;

public class MeasurableIndicatorResourceFromEntityAssembler {
    public static MeasurableIndicatorResource toResourceFromEntity(MeasurableIndicator entity) {
        return new MeasurableIndicatorResource(
                entity.getId(),
                entity.getSymbol(),
                entity.getDescription(),
                entity.getThresholdMinimum(),
                entity.getThresholdMaximum(),
                entity.getEquipmentType().toString()
        );
    }
}
