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
import java.util.List;

@WebServlet(urlPatterns = "/addStudent")
public class AddStudentController extends HttpServlet {

    Dao<Student> studentDao = new StudentDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("AddStudent.jsp")
                .forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Student student = new Student();
        student.setFirstName("Binod");
        student.setLastName("Binod");
        student.setAddress("MNR");
    studentDao.add(
          student
    );
        List<Student> studentList = studentDao.findAll();
        req.setAttribute("studentList",studentList);
    req.getRequestDispatcher("StudentList.jsp")
            .forward(req,resp);



    }
}
