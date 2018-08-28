package com.codecool.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "mentors")
public class Mentor extends Person {
    @ManyToMany
    private List<Language> languages;

    public Mentor() {
        super();
    }

    public Mentor(String name, String email, String phoneNumber, List<Language> languages) {
        super(name, email, phoneNumber);
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
