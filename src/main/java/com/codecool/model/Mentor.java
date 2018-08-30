package com.codecool.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(mappedBy = "mentorsList")
    private List<ClassRoom> classRoom = new ArrayList<>();

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
        this.classRoom.add(classRoom);
    }

    public PersonDetails getDetails() {
        return details;
    }

    public void setDetails(PersonDetails personDetails) {
        details = personDetails;
    }

    @PreRemove
    public void nullificarStudents() {
        students.forEach(student -> student.setPersonalMentor(null));
        students = null;
    }
}
