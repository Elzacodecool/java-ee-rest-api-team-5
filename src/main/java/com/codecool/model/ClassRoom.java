package com.codecool.model;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;


@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Expose
    private int id;

    @Expose
    private String className;

    @OneToMany(mappedBy = "classRoom")
    @ElementCollection
    @Expose
    private  List<Student> studentsList = new ArrayList<>();

    @ManyToMany(mappedBy = "classRoom")
    @ElementCollection
    @Expose
    private List<Mentor> mentorsList = new ArrayList<>();

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

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void setMentorsList(List<Mentor> mentorsList) {
        this.mentorsList = mentorsList;
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
