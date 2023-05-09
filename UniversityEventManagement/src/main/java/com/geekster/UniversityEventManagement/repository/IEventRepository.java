package com.geekster.UniversityEventManagement.repository;

import com.geekster.UniversityEventManagement.models.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {


    @Query(value="select * from Event order by date",nativeQuery = true)
    public Iterable<Event> getAllEventsByDate();
}
