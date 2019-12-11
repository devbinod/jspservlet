package np.com.pantbinod.controller;

import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.daoimpl.StudentDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateStudent")
public class UpdateStudentController extends HttpServlet {

    Dao dao = new StudentDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("student",

                dao.findById(Integer.parseInt(req.getParameter("id")))
                );
        req.getRequestDispatcher("UpdateStudent.jsp")
                .forward(req,resp);
    }
}
