package com.example.test1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.test1.model.Student;
import com.example.test1.service.StudentService;


@RestController
public class studentController {
    
    private StudentService studentService;

    @Autowired
    public studentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/p1")
    public String hello(){
        return "issah boy badshah!";
    }

    @PostMapping("/users")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>(this.studentService.saveStudent(student),HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(this.studentService.getAllStudent(),HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        this.studentService.DeleteStudent(id);
        return "Ok";
    }


}
