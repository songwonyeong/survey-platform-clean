package com.example.survey_platform.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Document(collection = "surveys_results")
public class SurveyResult {

    @Id
    private String id;

    private Long userId; // 추후 로그인 연동 시 사용
    private Map<String, String> answers; // {"q1": "frontend", "q2": "backend"}
    private Map<String, Double> scores;  // {"frontend": 66.7, "backend": 33.3}
    private LocalDateTime createdAt;

    // 생성자, Getter/Setter

    public SurveyResult() {}

    public SurveyResult(Long userId, Map<String, String> answers, Map<String, Double> scores) {
        this.userId = userId;
        this.answers = answers;
        this.scores = scores;
        this.createdAt = LocalDateTime.now();
    }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Map<String, String> getAnswers() { return answers; }
    public void setAnswers(Map<String, String> answers) { this.answers = answers; }

    public Map<String, Double> getScores() { return scores; }
    public void setScores(Map<String, Double> scores) { this.scores = scores; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
