package com.codecool.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mentor extends Person {
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
