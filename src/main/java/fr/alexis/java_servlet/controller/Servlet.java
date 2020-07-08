package fr.alexis.java_servlet.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    private static final String TEXT_MESSAGE = "TEST MESSAGE";
    private static final String LOGIN_TIME_PARAMETER_NAME = "";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + TEXT_MESSAGE + "</h1>");
        final String paramPseudo = req.getParameter("pseudo");
        out.println("Bonjour "+ paramPseudo + " ! </br>");
        // req.setAttribute(LOGIN_TIME_PARAMETER_NAME, loginTime);
        final HttpSession session = req.getSession();
        Long heureConnexion = session.getCreationTime();
        out.println("Heure de connexion:  "+ heureConnexion);
    }
}
