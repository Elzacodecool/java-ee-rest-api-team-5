package com.codecool.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "mentors")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private PersonDetails details;

    @ManyToMany
    private List<Language> languages;

    @OneToMany(mappedBy = "mentorsList")
    private List<ClassRoom> classRoom = new ArrayList<>();

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
}
