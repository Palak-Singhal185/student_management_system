package com.example.lms.Controller;

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
    public Student getStudent() {

        return new Student(
                1,
                "Palak",
                "BE"
        );
    }
}