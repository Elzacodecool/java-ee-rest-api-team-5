package com.codecool.servlets;

import com.codecool.model.*;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="student",
        urlPatterns = {"/student/*"})
public class StudentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String uri = request.getRequestURI();
        String pathInfo = request.getPathInfo();
        System.out.println(uri + " <-> " + pathInfo);
        StudentDAO studentDAO = new StudentDAO();
        populateDb(studentDAO);
        if (pathInfo != null) {

        } else {
            response.setHeader("Content-Type", "application/json");

            response.getWriter().write(getJSONStudents(studentDAO));

        }
    }

    private String getJSONStudents(StudentDAO studentDAO) {
        List<Student> studentList = studentDAO.getAllStudents();
        studentDAO.close();

        JSONArray array = new JSONArray();
        System.out.println(studentList.size());
        for (Student student: studentList) {
            JSONObject json = new JSONObject();
            PersonDetails personDetails = student.getDetails();
            ClassRoom classRoom = student.getClassRoom();

            json.put("id", student.getId());
            json.put("name", personDetails.getName());
            json.put("email", personDetails.getEmail());
            json.put("phoneNumber", personDetails.getPhoneNumber());
            json.put("personalMentor", student.getPersonalMentor().getDetails().getName());
            json.put("classroom", classRoom != null ? classRoom.getClassName(): "none");
            array.put(json);
        }
        return array.toString();
    }

    private void populateDb(StudentDAO studentDAO) {
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
    }
}
