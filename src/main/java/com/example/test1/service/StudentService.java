package com.example.test1.service;

import com.example.test1.model.Student;
import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    void DeleteStudent(int id);
    List<Student> getAllStudent();

}
