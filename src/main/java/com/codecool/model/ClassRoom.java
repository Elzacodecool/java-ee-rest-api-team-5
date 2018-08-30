package com.codecool.model;

import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;


@Entity
public class ClassRoom {
    @OneToMany(mappedBy = "classRoom")
    @ElementCollection
    transient List<Student> studentsList = new ArrayList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String className;

    @ManyToMany(mappedBy = "classRoom")
    @ElementCollection
    private transient List<Mentor> mentorsList = new ArrayList<>();

    public ClassRoom() {}

    public ClassRoom(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public List<Mentor> getMentorsList() {
        return mentorsList;
    }

    public int getId() {
        return id;
    }

    public void addStudent(Student student) {
        studentsList.add(student);
        student.setClass(this);
    }

    public void addMentor(Mentor mentor) {
        this.mentorsList.add(mentor);
        mentor.addClass(this);
    }

    public void deleteMentor(Mentor mentor) {
        this.mentorsList.remove(mentor);
    }
}
