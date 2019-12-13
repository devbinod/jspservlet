package np.com.pantbinod.controller;

import np.com.pantbinod.dao.Dao;
import np.com.pantbinod.daoimpl.GradeDaoImpl;
import np.com.pantbinod.enumlist.ActionList;
import np.com.pantbinod.model.Grade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/grades","/addGrade","/updateGrade","/deleteGrade"})
public class GradeController extends HttpServlet {
    Dao dao = new GradeDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
       if(action!=null){
           switch (action){

               case "ADD":
                   req.setAttribute("title","Grade List");
                   req.getRequestDispatcher("grade/add.jsp")
                           .forward(req,resp);
                   break;
               default:
                   System.out.println("called.. here");
                   req.setAttribute("title","Grade List");
                   req.setAttribute("gradeList",dao.findAll());
                   req.getRequestDispatcher("grade/index.jsp")
                           .forward(req,resp);


           }
       }else {
           System.out.println("called.. here");
           req.setAttribute("title","Grade List");
           req.setAttribute("gradeList",dao.findAll());
           req.getRequestDispatcher("grade/index.jsp")
                   .forward(req,resp);

       }





    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        switch (action){
            case "ADD":
                dao.add(new Grade(
                        req.getParameter("name")
                ));
                req.setAttribute("title","Grade List");
                req.setAttribute("gradeList",dao.findAll());
                req.getRequestDispatcher("grade/index.jsp")
                        .forward(req,resp);


        }




    }
}
