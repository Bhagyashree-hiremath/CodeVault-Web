package controller;

import dao.QuestionDAO;
import model.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/UpdateQuestionServlet")
public class UpdateQuestionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        Question q = new Question();

        q.setId(Integer.parseInt(request.getParameter("id")));
        q.setQuestion(request.getParameter("question"));
        q.setTopic(request.getParameter("topic"));
        q.setDifficulty(request.getParameter("difficulty"));
        q.setCompany(request.getParameter("company"));

        QuestionDAO dao = new QuestionDAO();

        dao.updateQuestion(q);

        response.sendRedirect("ViewQuestionsServlet");
    }
}