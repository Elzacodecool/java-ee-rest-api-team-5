package com.codecool.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "mentors")
public class Mentor extends Person {
    @ElementCollection
    @CollectionTable(name = "mentor_languages")
    private List<String> languages;

    public Mentor() {
        super();
    }

    public Mentor(String name, String email, String phoneNumber, List<String> languages) {
        super(name, email, phoneNumber);
        this.languages = languages;
    }

    public List<ClassRoom> getClassRoomList() {
        return null;
    }
}
