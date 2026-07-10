package controller;

import dao.QuestionDAO;
import model.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/EditQuestionServlet")
public class EditQuestionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        QuestionDAO dao = new QuestionDAO();

        Question question = dao.getQuestionById(id);

        request.setAttribute("question", question);

        request.getRequestDispatcher("editQuestion.jsp").forward(request, response);
    }
}