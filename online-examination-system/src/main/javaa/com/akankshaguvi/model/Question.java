package com.akankshaguvi.model;

public class Question {
    private int questionId;
    private int examId;
    private String questionText;
    private String questionType; // 'MCQ', 'Subjective'
    private int marks;

    // Getters and Setters
    public int getQuestionId() { return questionId; }
    public void setQuestionId(int questionId) { this.questionId = questionId; }
    public int getExamId() { return examId; }
    public void setExamId(int examId) { this.examId = examId; }
    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }
    public String getQuestionType() { return questionType; }
    public void setQuestionType(String questionType) { this.questionType = questionType; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }
}
