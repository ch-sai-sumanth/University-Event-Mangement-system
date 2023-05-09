package com.geekster.UniversityEventManagement.controllers;


import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.services.StudentServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping("/getAllStudents")
    public Iterable<Student> getAllStudents()
    {
        return studentServices.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentServices.getStudentById(id);
    }
    @PostMapping("/addStudent")
    public void addStudent(@Valid @RequestBody Student student)
    {
       studentServices.addStudent(student);
    }

    @PutMapping("/updateStudentDetails")
    public void updateStudentDetails(@RequestBody Student student)
    {
        studentServices.updateStudentDetails(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentById(@PathVariable int id)
    {
        studentServices.deleteStudentById(id);
    }

}
