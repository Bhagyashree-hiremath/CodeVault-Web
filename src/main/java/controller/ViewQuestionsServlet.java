package controller;

import dao.QuestionDAO;
import model.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/ViewQuestionsServlet")
public class ViewQuestionsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        QuestionDAO dao = new QuestionDAO();

        List<Question> list = dao.getAllQuestions();

        request.setAttribute("questions", list);

        request.getRequestDispatcher("viewQuestions.jsp")
               .forward(request, response);
    }
}