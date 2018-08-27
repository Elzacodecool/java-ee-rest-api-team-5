package com.codecool.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="student",
        urlPatterns = {"/student"})
public class StudentServlet extends HttpServlet {
}
