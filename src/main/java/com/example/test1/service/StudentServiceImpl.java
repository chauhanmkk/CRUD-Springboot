package com.example.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test1.model.Student;
import com.example.test1.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private  StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {     
        return studentRepository.save(student);
    }
    @Override
    public void DeleteStudent(int id) {
       studentRepository.deleteById(id);
    }
    @Override
    public List<Student> getAllStudent() {
        
        return (List<Student>)studentRepository.findAll();
    }
    
}
