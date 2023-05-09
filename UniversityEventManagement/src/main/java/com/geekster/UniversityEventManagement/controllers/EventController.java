package com.geekster.UniversityEventManagement.controllers;


import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.services.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {


    @Autowired
    EventServices eventServices;

    @PostMapping("/addEvent")
    public String addEvent(@RequestBody Event event)
    {
        String status=eventServices.addEvent(event);
        return status;
    }

    @PutMapping("updateEvent")
    public void updateEvent(@RequestBody Event event)
    {
        eventServices.updateEvent(event);
    }

    @DeleteMapping("/deleteEventById/{id}")
    public void deleteEventById(@PathVariable int id)
    {
        eventServices.deleteEventById(id);
    }

    @GetMapping("getAllEventsByDate")
    public Iterable<Event> getAllEventsByDate()
    {
        return eventServices.getAllEventsByDate();
    }

}

