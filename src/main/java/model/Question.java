package model;

public class Question {

    private int id;
    private String question;
    private String topic;
    private String difficulty;
    private String company;

    public Question() {
    }

    public Question(int id, String question, String topic, String difficulty, String company) {
        this.id = id;
        this.question = question;
        this.topic = topic;
        this.difficulty = difficulty;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}