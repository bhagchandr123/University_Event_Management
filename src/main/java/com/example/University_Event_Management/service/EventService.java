package com.example.University_Event_Management.service;

import com.example.University_Event_Management.model.Event;
import com.example.University_Event_Management.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event addEvent(Event event) {
        // Add business logic and repository interaction
        return eventRepository.save(event);
    }

    public Event updateEvent(Long eventId, Event event) {
        // Add business logic and repository interaction
        // You can fetch the event by ID, update its properties, and save it.
        return null; // Replace with actual implementation
    }

    public void deleteEvent(Long eventId) {
        // Add business logic and repository interaction
        eventRepository.deleteById(eventId);
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        // Add business logic and repository interaction
        return eventRepository.findAllByDate(date);

    }
}
