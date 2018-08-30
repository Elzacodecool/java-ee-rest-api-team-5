package com.codecool.servlets;

import com.codecool.DAOFactory.ClassRoomDAO;
import com.codecool.model.ClassRoom;
import com.google.gson.Gson;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="classrooms",
        urlPatterns = {"/classrooms/*"})
public class ClassroomServlet extends HttpServlet {
    private static ClassRoomDAO classRoomDAO;

    public ClassroomServlet(ClassRoomDAO classRoomDAO) {
        ClassroomServlet.classRoomDAO = classRoomDAO;
    }

    public ClassroomServlet() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        PrintWriter out = response.getWriter();

        String classRoomsString = getJSONAllClasses(pathInfo);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(classRoomsString);
        out.flush();
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) {
        String pathInfo = request.getPathInfo();
        int id = Integer.valueOf(pathInfo.split("/")[1]);
        classRoomDAO.deleteClassRoom(id);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        classRoomDAO.addClassRoom(new ClassRoom(name));
    }


    private String getJSONAllClasses(String pathInfo) {
        if(pathInfo==null) {
            return new Gson().toJson(classRoomDAO.getAllClasses());
        } else {
            int id = Integer.valueOf(pathInfo.split("/")[1]);
            System.out.println(id);
            ClassRoom classRoom = classRoomDAO.getClassRoom(id);
            return new Gson().toJson(classRoom);
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) {
        String pathInfo = request.getPathInfo();
        String [] parameters = pathInfo.split("/");
        String name = request.getParameter("name");

        if(parameters.length == 2) {
            String className = request.getParameter("name");
            int classRoomId = Integer.valueOf(pathInfo.split("/")[1]);
            classRoomDAO.editClassRoomName(classRoomId, className);
        } else if (parameters.length == 3) {
            switch(parameters[2]) {
                case "add-student-to-class":

            }
        }
    }
}
