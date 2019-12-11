package np.com.pantbinod.controller;

import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.daoimpl.StudentDaoImpl;
import np.com.pantbinod.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/studentList")
public class StudentListController extends HttpServlet {

    Dao<Student> studentDao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setAttribute("studentList",studentDao.findAll());
        req.getRequestDispatcher("StudentList.jsp")
                .forward(req,resp);

    }
}
