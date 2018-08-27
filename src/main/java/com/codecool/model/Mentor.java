package com.codecool.model;

import java.util.List;

public class Mentor extends Person {

    private List<ClassRoom> classRoomList;

    public Mentor() {
        super();
    }

    public Mentor(String name, String email, String phoneNumber, List<ClassRoom> classRoomList) {
        super(name, email, phoneNumber);
        this.classRoomList = classRoomList;
    }

    public List<ClassRoom> getClassRoomList() {
        return classRoomList;
    }

    public void setClassRoomList(List<ClassRoom> classRoomList) {
        this.classRoomList = classRoomList;
    }
}
