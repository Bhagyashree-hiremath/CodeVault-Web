package dao;

import model.Question;
import util.DBConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QuestionDAO {

    public boolean addQuestion(Question question) {

        String sql = "INSERT INTO questions(question, topic, difficulty, company) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getTopic());
            ps.setString(3, question.getDifficulty());
            ps.setString(4, question.getCompany());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public List<Question> getAllQuestions() {

        List<Question> list = new ArrayList<>();

        String sql = "SELECT * FROM questions";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Question q = new Question();

                q.setId(rs.getInt("id"));
                q.setQuestion(rs.getString("question"));
                q.setTopic(rs.getString("topic"));
                q.setDifficulty(rs.getString("difficulty"));
                q.setCompany(rs.getString("company"));

                list.add(q);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public boolean deleteQuestion(int id) {

        String sql = "DELETE FROM questions WHERE id=?";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}