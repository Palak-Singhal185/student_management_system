package com.example.lms.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms.model.Student;
@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @GetMapping
    public List<Student>     getStudent() {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Palak","Java"));
        students.add(new Student(2,"Rohit","Python"));
        return students;
    }
}