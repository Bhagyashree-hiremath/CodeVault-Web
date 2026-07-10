package controller;

import dao.QuestionDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
    	HttpSession session = request.getSession(false);

    	if (session == null || session.getAttribute("user") == null) {
    	    response.sendRedirect("login.jsp");
    	    return;
    	}

        QuestionDAO dao = new QuestionDAO();

        request.setAttribute("totalQuestions", dao.getTotalQuestions());
        request.setAttribute("totalCompanies", dao.getTotalCompanies());
        request.setAttribute("totalTopics", dao.getTotalTopics());

        request.getRequestDispatcher("dashboard.jsp")
               .forward(request, response);
    }
}