package com.tdb.hop.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.tdb.hop.data.entity.Event;
import org.springframework.stereotype.Repository;

public interface EventRepository extends PagingAndSortingRepository <Event, Long>
{

}
