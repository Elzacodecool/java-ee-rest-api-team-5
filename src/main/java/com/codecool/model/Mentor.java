package com.codecool.model;

import javax.persistence.*;
import java.util.List;

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
    public List<ClassRoom> getClassRoomList() {
        return null;
    }
}
