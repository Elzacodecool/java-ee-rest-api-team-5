package com.codecool.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name="mentor",
        urlPatterns = {"/mentor"})
public class MentorServlet extends HttpServlet {
}
