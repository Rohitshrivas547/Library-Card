package com.example.librarysystem.Repository;

import com.example.librarysystem.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
