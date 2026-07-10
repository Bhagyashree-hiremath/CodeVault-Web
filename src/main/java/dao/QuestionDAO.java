package dao;

import model.Question;
import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {

    // Add Question
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

    // View All Questions
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

    // Delete Question
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

    // Get Question By ID
    public Question getQuestionById(int id) {

        Question question = null;

        String sql = "SELECT * FROM questions WHERE id=?";

        try {

            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                question = new Question();

                question.setId(rs.getInt("id"));
                question.setQuestion(rs.getString("question"));
                question.setTopic(rs.getString("topic"));
                question.setDifficulty(rs.getString("difficulty"));
                question.setCompany(rs.getString("company"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return question;
    }

    // Update Question
    public boolean updateQuestion(Question question) {

        String sql = "UPDATE questions SET question=?, topic=?, difficulty=?, company=? WHERE id=?";

        try {

            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getTopic());
            ps.setString(3, question.getDifficulty());
            ps.setString(4, question.getCompany());
            ps.setInt(5, question.getId());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
 // Search Questions by Topic
    public List<Question> searchByTopic(String topic) {

        List<Question> list = new ArrayList<>();

        String sql = "SELECT * FROM questions WHERE topic LIKE ?";

        try {

            Connection conn = DBConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, "%" + topic + "%");

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
    public int getTotalQuestions() {

        int count = 0;

        String sql = "SELECT COUNT(*) FROM questions";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
    public int getTotalCompanies() {

        int count = 0;

        String sql = "SELECT COUNT(DISTINCT company) FROM questions";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
    public int getTotalTopics() {

        int count = 0;

        String sql = "SELECT COUNT(DISTINCT topic) FROM questions";

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return count;
    }
}