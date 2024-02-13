package com.example.StudentManagement;

import com.example.StudentManagement.Repository.StudentRepository;
import com.example.StudentManagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class StudentManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1=new Student("Ramya","English","ramya12@gmail.com");
		studentRepository.save(student1);

		Student student2=new Student("Devi","Computer Science","devi23@gmail.com");
		studentRepository.save(student2);

		Student student3=new Student("janani","Biology","devi23@gmail.com");
		studentRepository.save(student3);*/
	}
}
