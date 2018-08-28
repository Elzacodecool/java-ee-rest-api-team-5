package com.codecool.model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private PersonDetails details;

    @ManyToOne
    private Mentor personalMentor;

    public Student() {
    }

    public Student(PersonDetails details, Mentor mentor) {
        this.details = details;
        this.personalMentor = mentor;
    }

    public Mentor getPersonalMentor() {
        return personalMentor;
    }

    public void setPersonalMentor(Mentor personalMentor) {
        this.personalMentor = personalMentor;
    }

    public PersonDetails getDetails() {
        return details;
    }

    public void setDetails(PersonDetails personDetails) {
        details = personDetails;
    }
}
