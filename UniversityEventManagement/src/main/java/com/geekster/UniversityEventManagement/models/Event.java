package com.geekster.UniversityEventManagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int eventId;

    String eventName;
    String location;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;

}