package com.geekster.UniversityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @Pattern(regexp="^[A-Z][a-z]*$")
    private String firstName;
    private String lastName;

   // @Pattern(regexp ="^(1[8-9]|2[0-5])$")
    private int age;


    @Enumerated(EnumType.STRING)
    private Departments department;
}
