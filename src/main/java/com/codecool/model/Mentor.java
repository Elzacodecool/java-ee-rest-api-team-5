package com.codecool.model;

import javax.persistence.*;


@Entity
public class Mentor extends Person {

    public Mentor() {
        super();
    }

    public Mentor(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
    }
}
