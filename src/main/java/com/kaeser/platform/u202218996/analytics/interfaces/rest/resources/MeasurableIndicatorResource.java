package com.kaeser.platform.u202218996.analytics.interfaces.rest.resources;

public record MeasurableIndicatorResource(Long id, String symbol, String description, Double thresholdMinimum, Double thresholdMaximum, String equipmentType) {
}
