package com.tdb.hop.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.tdb.hop.data.entity.PhSensor;
import org.springframework.stereotype.Repository;

public interface PhSensorRepository extends CrudRepository <PhSensor, Long> {

}
