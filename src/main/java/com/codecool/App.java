package com.codecool;

import com.codecool.DAOFactory.StudentDAO;
import com.codecool.servlets.StudentServlet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class App implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("codecoolPU");
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.addServlet("student", new StudentServlet(new StudentDAO(factory)));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}