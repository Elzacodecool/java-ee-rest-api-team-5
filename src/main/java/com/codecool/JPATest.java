package com.codecool;

import com.codecool.model.ClassRoom;
import com.codecool.model.Language;
import com.codecool.model.Mentor;
import com.codecool.model.Student;

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
        Mentor mentor = new Mentor("Marcin Izworski", "m.izworski@gmail.com","123456789",languageList);
        Student student = new Student("Elzbieta Krzych", "elzbieta.krzych@gmail.com","123456789", mentor);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(mentor);

        ClassRoom classA = new ClassRoom("webRoom", studentList, mentorList);

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(languageJava);
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
