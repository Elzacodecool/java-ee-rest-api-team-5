package com.codecool.DAOFactory;

import com.codecool.model.ClassRoom;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ClassRoomDAO {
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public ClassRoomDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void addClassRoom(ClassRoom classRoom) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(classRoom);
        transaction.commit();
    }

    public List<ClassRoom> getAllClasses () {
        Session session = (Session) entityManager.getDelegate();
        List classRoomList = session.createCriteria(ClassRoom.class).list();
        return (List<ClassRoom>) classRoomList;
    }

    public ClassRoom getClassRoom(int id) {
        return entityManager.find(ClassRoom.class, id);
    }

    public void deleteClassRoom(int id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(getClassRoom(id));
        transaction.commit();
    }

    public void editClassRoomName(int classRoomId, String name) {
        ClassRoom classRoom = getClassRoom(classRoomId);
        classRoom.setClassName(name);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(classRoom);
        transaction.commit();
    }



}
