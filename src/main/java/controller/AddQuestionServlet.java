package controller;

import java.io.IOException;

import dao.QuestionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Question;

@WebServlet("/AddQuestionServlet")
public class AddQuestionServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String question = request.getParameter("question");
        String topic = request.getParameter("topic");
        String difficulty = request.getParameter("difficulty");
        String company = request.getParameter("company");

        Question q = new Question();

        q.setQuestion(question);
        q.setTopic(topic);
        q.setDifficulty(difficulty);
        q.setCompany(company);

        QuestionDAO dao = new QuestionDAO();

        if (dao.addQuestion(q)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.getWriter().println("Failed to save question!");
        }
    }
}