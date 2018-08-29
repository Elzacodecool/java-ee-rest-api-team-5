package com.codecool.DAOFactory;

import com.codecool.model.Language;
import com.codecool.model.Mentor;
import com.codecool.model.PersonDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MentorDAO {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public MentorDAO(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("codecoolPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public MentorDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public Mentor getMentor(int id) {
        return entityManager.find(Mentor.class, id );
    }

    public List<Mentor> getAllMentors() {
        return entityManager.createQuery( "SELECT m FROM Mentor m" )
                .getResultList();
    }
    public void addMentor(Mentor mentor) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(mentor.getDetails());
        for (Language language: mentor.getLanguages()) {
            entityManager.persist(language);
        }
        entityManager.persist(mentor);
        transaction.commit();
    }

    public Mentor editMentor(Mentor mentor) {
        return entityManager.merge(mentor);
    }

    public void deleteMentor(Mentor mentor) {
        entityManager.remove(mentor);
    }

    public void deleteMentor(int id) {
        deleteMentor(getMentor(id));
    }
    public static void main(String[] args) {
        MentorDAO mentorDAO = new MentorDAO();

        PersonDetails personDetails = new PersonDetails("eliza", "email", "phone");
        List<Language> languages = new ArrayList<>();
        languages.add(new Language("java"));

        Mentor mentor = new Mentor(personDetails, languages);
        mentorDAO.deleteMentor(4);
        System.out.println("after delete");

    }
}
