package com.jaahanava.studentmanagementsystem.service;

import java.util.List;

import com.jaahanava.studentmanagementsystem.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}