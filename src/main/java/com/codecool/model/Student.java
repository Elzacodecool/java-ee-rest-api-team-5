package com.codecool.model;

public class Student extends Person {

    private Mentor personalMentor;

    public Student() {
        super();
    }

    public Student(String name, String email, String phoneNumber, Mentor mentor) {
        super(name, email, phoneNumber);
        this.personalMentor = mentor;
    }

    public Mentor getPersonalMentor() {
        return personalMentor;
    }

    public void setPersonalMentor(Mentor personalMentor) {
        this.personalMentor = personalMentor;
    }
}
