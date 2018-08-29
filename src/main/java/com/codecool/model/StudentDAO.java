package com.codecool.model;

import org.hibernate.Session;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public StudentDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("codecoolPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void addStudent(Student student) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(student.getDetails());
        entityManager.persist(student);
        transaction.commit();
    }

    public Student getStudent(int id) {
        return entityManager.find(Student.class, id);
    }

    public List<Student> getAllStudents() {
        Session session = (Session) entityManager.getDelegate();
        List studentsList = session.createCriteria(Student.class).list();
        return (List<Student>) studentsList;

    }

    public void close() {
        entityManager.close();
    }

    public void open() {
        entityManager = entityManagerFactory.createEntityManager();
    }


    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Language language = new Language("Java");

        List<Language> languages = new ArrayList<>();
        languages.add(language);

        PersonDetails personDetails = new PersonDetails("Imie Nazwisko", "Email", "Numer tel");

        Mentor mentor = new Mentor(personDetails, languages);
        PersonDetails studentDetails = new PersonDetails("Student Name", "Student email", "phone number");
        Student student = new Student(studentDetails, mentor);
        ClassRoom classRoom = new ClassRoom("WEB");
        Student student2 = new Student(new PersonDetails("Second student", "email", "number"), mentor);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("codecoolPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(language);
        entityManager.persist(personDetails);
        entityManager.persist(mentor);
        entityManager.persist(classRoom);
        transaction.commit();

        entityManager.close();
        entityManagerFactory.close();

        studentDAO.addStudent(student2);
        studentDAO.addStudent(student);


        List<Student> students = studentDAO.getAllStudents();
        studentDAO.close();
    }
}
