package com.jaahanava.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaahanava.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository <Student, Long>{
    
}