package com.codecool.DAOFactory;

import com.codecool.model.*;
import org.hibernate.Session;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public StudentDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        entityManager = entityManagerFactory.createEntityManager();
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
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
}
