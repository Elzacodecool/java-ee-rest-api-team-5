package com.codecool.servlets;

import com.codecool.DAOFactory.MentorDAO;
import com.codecool.DAOFactory.StudentDAO;
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
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@WebServlet(name="student",
        urlPatterns = {"/student/*"})
public class StudentServlet extends HttpServlet {

    private static StudentDAO studentDAO;

    public StudentServlet(StudentDAO dao) {
        studentDAO = dao;
    }

    public StudentServlet() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathInfo = request.getPathInfo();
//        populateDb(studentDAO);

        if (pathInfo != null) {
            int studentId = parseStudentId(pathInfo);
            studentDAO.open();
            String jsonStudent = getJSONStudent(studentDAO.getStudent(studentId)).toString();

            response.setHeader("Content-Type", "application/json");

            response.getWriter().write(jsonStudent);

        } else {
            response.setHeader("Content-Type", "application/json");

            response.getWriter().write(getJSONStudents());

        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pathInfo = request.getPathInfo();
//        populateDb(studentDAO);
        if (pathInfo == null) {
            studentDAO.open();
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phoneNumber = request.getParameter("phoneNumber");
            int personalMentorId = Integer.parseInt(request.getParameter("personalMentor"));

            Mentor mentor = new MentorDAO(studentDAO.getEntityManagerFactory()).getMentor(personalMentorId);

            PersonDetails userDetails = new PersonDetails(name, email, phoneNumber);
            Student student = new Student(userDetails, mentor);
            studentDAO.addStudent(student);
            response.setHeader("Content-Type", "application/json");
            response.getWriter().write(getJSONStudent(student).toString());

            studentDAO.close();
        }
    }

    @Override
    public void doPut(HttpServletRequest request, HttpServletResponse response) {
        String pathInfo = request.getPathInfo();

        if (pathInfo != null) {
            studentDAO.open();
            int studentId = parseStudentId(pathInfo);
            Student student = studentDAO.getStudent(studentId);
            studentDAO.updateStudent(student, getUpdatedValues(request));
        }
    }

    private Map<String, String> getUpdatedValues(HttpServletRequest request) {
        Map<String, String> updatedValues = new HashMap<>();
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            updatedValues.put(paramName, request.getParameter(paramName));
        }
        return updatedValues;
    }

    private int parseStudentId(String pathInfo) {
        String[] splittedPathInfo = pathInfo.split("/");
        List<String> clearSplittedPathInfo = clearSplitedPathInfo(splittedPathInfo);
        return Integer.parseInt(clearSplittedPathInfo.get(0));
    }

    private List<String> clearSplitedPathInfo(String[] pathInfo) {
        List<String> clearPathInfo = new ArrayList<>();
        for (String pathElement: pathInfo) {
            if (!pathElement.equals("")) {
                clearPathInfo.add(pathElement);
            }
        }
        return clearPathInfo;
    }

    private String getJSONStudents() {
        studentDAO.open();
        List<Student> studentList = studentDAO.getAllStudents();
        studentDAO.close();

        JSONArray array = new JSONArray();
        System.out.println(studentList.size());
        for (Student student: studentList) {
            array.put(getJSONStudent(student));
        }
        return array.toString();
    }

    private JSONObject getJSONStudent(Student student) {
        JSONObject json = new JSONObject();
        PersonDetails personDetails = student.getDetails();
        ClassRoom classRoom = student.getClassRoom();

        json.put("id", student.getId());
        json.put("name", personDetails.getName());
        json.put("email", personDetails.getEmail());
        json.put("phoneNumber", personDetails.getPhoneNumber());
        json.put("personalMentor", student.getPersonalMentor().getDetails().getName());
        json.put("classroom", classRoom != null ? classRoom.getClassName(): "none");
        return json;
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
