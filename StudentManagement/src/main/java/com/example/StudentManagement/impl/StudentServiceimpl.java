package com.example.StudentManagement.impl;

import com.example.StudentManagement.Repository.StudentRepository;
import com.example.StudentManagement.Service.StudentService;
import com.example.StudentManagement.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService {

    public StudentServiceimpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    private StudentRepository studentRepository;

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

}
