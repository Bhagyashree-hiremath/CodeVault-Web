package controller;

import dao.QuestionDAO;
import model.Question;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/SearchQuestionServlet")
public class SearchQuestionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String topic = request.getParameter("topic");

        QuestionDAO dao = new QuestionDAO();

        List<Question> list = dao.searchByTopic(topic);

        request.setAttribute("questions", list);

        request.getRequestDispatcher("search.jsp").forward(request, response);
    }
}