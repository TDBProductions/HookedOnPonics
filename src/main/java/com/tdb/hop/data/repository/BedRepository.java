package com.tdb.hop.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.tdb.hop.data.entity.Bed;
import org.springframework.stereotype.Repository;

public interface BedRepository extends CrudRepository<Bed, Long> {

}
