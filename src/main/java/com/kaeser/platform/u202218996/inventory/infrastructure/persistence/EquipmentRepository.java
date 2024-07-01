package com.kaeser.platform.u202218996.inventory.infrastructure.persistence;

import com.kaeser.platform.u202218996.inventory.domain.aggregates.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    boolean existsByMaterialSerialNumber(UUID materialSerialNumber);
}
