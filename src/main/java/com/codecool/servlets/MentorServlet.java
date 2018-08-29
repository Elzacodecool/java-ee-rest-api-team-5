package com.codecool.servlets;

import com.codecool.DAOFactory.MentorDAO;
import com.codecool.model.Mentor;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="mentors",
        urlPatterns = {"/mentors/*"})
public class MentorServlet extends HttpServlet {
    private MentorDAO mentorDAO = new MentorDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        PrintWriter out = response.getWriter();
        String employeeJsonString = getJsonStringMentors(pathInfo);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(employeeJsonString);
        out.flush();
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        int id = Integer.valueOf(pathInfo.split("/")[1]);
        mentorDAO.deleteMentor(id);
    }

    private String getJsonStringMentors(String pathInfo) {
        if (pathInfo == null) {
            return new Gson().toJson(mentorDAO.getAllMentors());
        } else {
            int id = Integer.valueOf(pathInfo.split("/")[1]);
            Mentor mentor = mentorDAO.getMentor(id);
            return new Gson().toJson(mentor);
        }
    }
}
