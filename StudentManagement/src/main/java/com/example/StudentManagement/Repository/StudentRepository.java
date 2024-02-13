package com.example.StudentManagement.Repository;

import com.example.StudentManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
