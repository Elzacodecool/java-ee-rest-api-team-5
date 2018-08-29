package com.codecool;

import com.codecool.model.StudentDAO;
import com.codecool.servlets.StudentServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class App implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.addServlet("student", new StudentServlet(new StudentDAO()));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}
