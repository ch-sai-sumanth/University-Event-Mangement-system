package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    IStudentRepository iStudentRepository;



    public void addStudent(Student studentData) {
        iStudentRepository.save(studentData);
    }

    public void updateStudentDetails(Student studentData) {
        iStudentRepository.save(studentData);
    }

    public void deleteStudentById(int id) {
        iStudentRepository.deleteById(id);
    }

    public Iterable<Student> getAllStudents() {
        return iStudentRepository.findAll();
    }

    public Student getStudentById(int id) {
        for(Student student:iStudentRepository.findAll())
        {
            if(student.getStudentId()==id)
                return student;
        }
        return null;
    }
}
