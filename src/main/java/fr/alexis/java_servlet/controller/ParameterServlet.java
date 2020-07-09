package fr.alexis.java_servlet.controller;

import fr.alexis.java_servlet.model.Reporter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Reporter reporter = new Reporter();
        final String paramPseudo = req.getParameter("pseudo");
        reporter.setPseudo(paramPseudo);
        req.setAttribute("reporter", reporter);
        this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/parameter.jsp" ).forward( req, resp );
    }
}
