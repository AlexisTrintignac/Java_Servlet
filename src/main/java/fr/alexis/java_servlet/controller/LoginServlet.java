package fr.alexis.java_servlet.controller;

import fr.alexis.java_servlet.service.LoginMockService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private LoginMockService loginService;

    @Override
    public void init() throws ServletException {
        this.loginService = new LoginMockService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/login.jsp" ).forward( req, resp );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("pseudo");
        String mdp = req.getParameter("mdp");
        req.setAttribute("pseudo", id);
        req.setAttribute("mdp", mdp);
        if (this.loginService.isAllowedToLogOn(id, mdp)) {
            System.out.println("OK");
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/target.jsp").forward(req, resp);
        } else {
            System.out.println("KO");
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
        }
    }
}
