package com.kaeser.platform.u202218996.inventory.domain.aggregates;

import com.kaeser.platform.u202218996.shared.domain.model.AuditableModel;
import com.kaeser.platform.u202218996.shared.domain.model.EquipmentType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Equipment extends AuditableModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, updatable = false)
    private UUID materialSerialNumber;

    @Column(nullable = false)
    private String model;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EquipmentType equipmentType;

    @PrePersist
    public void generateSerialNumber() {
        this.materialSerialNumber = UUID.randomUUID();
    }
}
