package com.kaeser.platform.u202218996.analytics.domain.aggregates;

import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MeasurableIndicator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private Double thresholdMinimum;

    @Column(nullable = false)
    private Double thresholdMaximum;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EquipmentType equipmentType;
}

