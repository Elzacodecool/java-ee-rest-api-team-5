package com.codecool.model;

import com.google.gson.annotations.Expose;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "mentors")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Expose
    private int id;

    @OneToOne(orphanRemoval = true)
    @Expose
    private PersonDetails details;

    @ManyToMany
    @Expose
    private List<Language> languages;

    @ManyToMany(mappedBy = "mentorsList", cascade = CascadeType.ALL)
    private List<ClassRoom> classRooms = new ArrayList<>();

    @OneToMany(mappedBy = "personalMentor")
    private List<Student> students;

    public Mentor() {
    }

    public Mentor(PersonDetails details, List<Language> languages) {
        this.details = details;
        this.languages = languages;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }
    public void addClass(ClassRoom classRoom) {
        this.classRooms.add(classRoom);
    }

    public PersonDetails getDetails() {
        return details;
    }

    public void setDetails(PersonDetails personDetails) {
        details = personDetails;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public List<Student> getStudents() {
        return students;
    }

    @PreRemove
    public void nullificarStudents() {
        students.forEach(student -> student.setPersonalMentor(null));
    }
}
