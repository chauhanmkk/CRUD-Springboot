package com.example.test1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test1.model.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

}