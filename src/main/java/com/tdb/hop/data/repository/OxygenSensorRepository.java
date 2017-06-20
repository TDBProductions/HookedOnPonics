package com.tdb.hop.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.tdb.hop.data.entity.OxygenSensor;
import org.springframework.stereotype.Repository;

public interface OxygenSensorRepository extends CrudRepository <OxygenSensor, Long>{

}
