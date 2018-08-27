package com.codecool.model;

public class Student extends Person {

    private ClassRoom classRoom;

    private Mentor personalMentor;

    public Student() {
        super();
    }

    public Student(String name, String email, String phoneNumber, ClassRoom classRoom, Mentor mentor) {
        super(name, email, phoneNumber);
        this.classRoom = classRoom;
        this.personalMentor = mentor;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Mentor getPersonalMentor() {
        return personalMentor;
    }

    public void setPersonalMentor(Mentor personalMentor) {
        this.personalMentor = personalMentor;
    }
}
