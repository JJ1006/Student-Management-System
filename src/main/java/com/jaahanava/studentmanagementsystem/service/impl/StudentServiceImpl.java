package com.jaahanava.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jaahanava.studentmanagementsystem.entity.Student;
import com.jaahanava.studentmanagementsystem.repository.StudentRepository;
import com.jaahanava.studentmanagementsystem.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}