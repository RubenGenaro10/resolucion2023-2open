package com.kaeser.platform.u202218996.analytics.infrastructure.persistence;

import com.kaeser.platform.u202218996.analytics.domain.aggregates.MeasurableIndicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurableIndicatorRepository extends JpaRepository<MeasurableIndicator, Long> {
}

