package np.com.pantbinod.controller;

import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.daoimpl.StudentDaoImpl;
import np.com.pantbinod.enumlist.ActionList;
import np.com.pantbinod.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/students","/addStudent","/deleteStudent","/updateStudent"})
public class StudentController extends HttpServlet {

    Dao dao = new StudentDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {

            req.setAttribute("title", "student list");
            req.setAttribute("studentList", dao.findAll());
            req.getRequestDispatcher("student/index.jsp")
                    .forward(req, resp);

        }else {

            if (action.equalsIgnoreCase(ActionList.ADD.toString())) {
                req.setAttribute("title", "add student");
                req.getRequestDispatcher("student/add.jsp")
                        .forward(req, resp);
            }else if(action.equalsIgnoreCase(ActionList.DELETE.toString())){
                req.setAttribute("title","student List");
                dao.delete(Integer.parseInt(req.getParameter("id")));
                req.setAttribute("studentList", dao.findAll());
                req.getRequestDispatcher("student/index.jsp")
                        .forward(req, resp);

            }else if(action.equalsIgnoreCase(ActionList.UPDATE.toString())){
                req.setAttribute("title","Update student");
                req.setAttribute("student",dao.findById(
                        Integer.parseInt(req.getParameter("id"))
                ));
                req.getRequestDispatcher("student/update.jsp")
                        .forward(req,resp);
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Student student = new Student();
        student.setFirstName(req.getParameter("firstName"));
        student.setLastName(req.getParameter("lastName"));
        student.setAddress(req.getParameter("address"));
        student.setPhoneNumber(req.getParameter("phoneNumber"));
        dao.add(
                student
        );
        List<Student> studentList = dao.findAll();
        req.setAttribute("studentList",studentList);
        req.getRequestDispatcher("student/index.jsp")
                .forward(req,resp);

    }
}
