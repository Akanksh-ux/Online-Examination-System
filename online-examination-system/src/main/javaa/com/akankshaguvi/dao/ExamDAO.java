package com.akankshaguvi.dao;

import com.akankshaguvi.model.Exam;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExamDAO {
    private Connection connection;

    // Constructor to initialize the database connection
    public ExamDAO(Connection connection) {
        this.connection = connection;
    }

    // Add a new exam to the database
    public void addExam(Exam exam) throws SQLException {
        String query = "INSERT INTO Exams (title, description, start_time, end_time, created_by) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, exam.getTitle());
            stmt.setString(2, exam.getDescription());
            stmt.setString(3, exam.getStartTime());
            stmt.setString(4, exam.getEndTime());
            stmt.setInt(5, exam.getCreatedBy());
            stmt.executeUpdate();
        }
    }

    // Retrieve an exam by its ID
    public Exam getExamById(int examId) throws SQLException {
        String query = "SELECT * FROM Exams WHERE exam_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, examId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Exam exam = new Exam();
                exam.setExamId(rs.getInt("exam_id"));
                exam.setTitle(rs.getString("title"));
                exam.setDescription(rs.getString("description"));
                exam.setStartTime(rs.getString("start_time"));
                exam.setEndTime(rs.getString("end_time"));
                exam.setCreatedBy(rs.getInt("created_by"));
                return exam;
            }
        }
        return null;
    }

    // Retrieve all exams from the database
    public List<Exam> getAllExams() throws SQLException {
        List<Exam> exams = new ArrayList<>();
        String query = "SELECT * FROM Exams";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Exam exam = new Exam();
                exam.setExamId(rs.getInt("exam_id"));
                exam.setTitle(rs.getString("title"));
                exam.setDescription(rs.getString("description"));
                exam.setStartTime(rs.getString("start_time"));
                exam.setEndTime(rs.getString("end_time"));
                exam.setCreatedBy(rs.getInt("created_by"));
                exams.add(exam);
            }
        }
        return exams;
    }
}
