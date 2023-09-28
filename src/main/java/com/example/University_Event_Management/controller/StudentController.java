package com.example.University_Event_Management.controller;

import com.example.University_Event_Management.Enum.Department;
import com.example.University_Event_Management.service.StudentService;
import com.example.University_Event_Management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add Student
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student addedStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedStudent);
    }

    // Update Student Department
    @PutMapping("/{studentId}/update-department")
    public ResponseEntity<Student> updateStudentDepartment(
            @PathVariable Long studentId,
            @RequestParam Department department) {
        Student updatedStudent = studentService.updateStudentDepartment(studentId, department);
        return ResponseEntity.ok(updatedStudent);
    }

    // Delete Student
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.noContent().build();
    }

    // Get All Students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    // Get Student by Id
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }
}
