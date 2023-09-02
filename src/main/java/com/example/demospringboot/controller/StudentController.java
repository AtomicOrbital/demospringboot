package com.example.demospringboot.controller;

import com.example.demospringboot.dto.Student;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class StudentController {
    private final List<Student> students = new ArrayList<>();

    // @RequestParam
    @GetMapping("/addStudentRequestParam")
    public List<Student> addStudentRequestParam(@RequestParam String name, @RequestParam int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return students;
    }

    // @PathVariable
    @GetMapping("/addStudentRequestParam/{name}/{age}")
    public List<Student> addStudentPathVariable(@PathVariable String name, @PathVariable int age){
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        students.add(student);
        return students;
    }

    // @RequestBody
    @PostMapping("/addStudentRequestBody")
    public List<Student> addStudentRequestBody(@RequestBody Student student){
        students.add(student);
        return students;
    }
}
