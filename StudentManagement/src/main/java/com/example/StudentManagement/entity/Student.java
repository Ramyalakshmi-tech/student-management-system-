package com.example.StudentManagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentManagement")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name",nullable=false)
    private String FirstName;

    @Column(name="CourseName")
    private String CourseName;
    @Column(name="email")
    private String email;
public Student(){

}
public Student( String firstName, String courseName, String email) {
        super();
        FirstName = firstName;
        CourseName = courseName;
        this.email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
