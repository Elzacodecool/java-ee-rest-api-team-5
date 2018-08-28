package com.codecool;

import com.codecool.model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class JPATest {
    public static void populateDb(EntityManager em) {
        List<Language> languageList = new ArrayList<>();
        Language languageJava = new Language("Java");
        languageList.add(languageJava);

        PersonDetails mentorDetails = new PersonDetails("Marcin Izworski", "m.izworski@gmail.com","123456789");
        Mentor mentor = new Mentor(mentorDetails, languageList);

        PersonDetails studentDetails = new PersonDetails("Elzbieta Krzych", "elzbieta.krzych@gmail.com","123456789");
        Student student = new Student(studentDetails, mentor);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(mentor);

        ClassRoom classA = new ClassRoom("webRoom");

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(languageJava);
        em.persist(mentorDetails);
        em.persist(studentDetails);
        em.persist(mentor);
        em.persist(student);
        em.persist(classA);
        transaction.commit();

    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("codecoolPU");
        EntityManager em = emf.createEntityManager();

        populateDb(em);

        em.close();
        emf.close();

    }
}
