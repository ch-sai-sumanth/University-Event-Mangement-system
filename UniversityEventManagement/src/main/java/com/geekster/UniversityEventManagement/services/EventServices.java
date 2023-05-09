package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.repository.IEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServices {

    @Autowired
    IEventRepository iEventRepository;

    public String addEvent(Event event) {

        iEventRepository.save(event);

        return "event added succesfully";

    }

    public void updateEvent(Event event) {
        iEventRepository.save(event);
    }

    public void deleteEventById(int id) {
        iEventRepository.deleteById(id);
    }



    @Transactional
    public Iterable<Event> getAllEventsByDate() {
        return iEventRepository.getAllEventsByDate();
    }
}
