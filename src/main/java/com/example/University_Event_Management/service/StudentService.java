package com.example.University_Event_Management.service;

import com.example.University_Event_Management.Enum.Department;
import com.example.University_Event_Management.model.Student;
import com.example.University_Event_Management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        // Add business logic and repository interaction
        return studentRepository.save(student);
    }

    public Student updateStudentDepartment(Long studentId, Department department) {
        // Add business logic and repository interaction
        // You can fetch the student by ID, update the department, and save it.
        return null; // Replace with actual implementation

    }

    public void deleteStudent(Long studentId) {
        // Add business logic and repository interaction
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
        // Add business logic and repository interaction
        return studentRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        // Add business logic and repository interaction
        return studentRepository.findById(studentId).orElse(null);
    }
}
