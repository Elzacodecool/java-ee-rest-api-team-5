package com.codecool.model;

import javax.persistence.*;
import java.util.List;

public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String className;

    private List<Student> studentsList;

    private List<Mentor> mentorsList;

    public ClassRoom() {}

    public ClassRoom(String className, List<Student> studentsList, List<Mentor> mentorsList) {
        this.className = className;
        this.studentsList = studentsList;
        this.mentorsList = mentorsList;
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

    public List<Mentor> getMentorsList() {
        return mentorsList;
    }

    public void setMentorsList(List<Mentor> mentorsList) {
        this.mentorsList = mentorsList;
    }
}
