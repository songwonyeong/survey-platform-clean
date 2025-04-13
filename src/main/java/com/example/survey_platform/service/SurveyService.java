package com.example.survey_platform.service;

import com.example.survey_platform.model.SurveyResult;
import com.example.survey_platform.repository.SurveyResultRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SurveyService {

    private final SurveyResultRepository repository;

    public SurveyService(SurveyResultRepository repository) {
        this.repository = repository;
    }

    public Map<String, Double> calculateAndSave(Map<String, String> answers) {
        Map<String, Integer> counts = new HashMap<>();
        int total = answers.size();

        // 1. 직무별 응답 수 계산
        for (String job : answers.values()) {
            counts.put(job, counts.getOrDefault(job, 0) + 1);
        }

        // 2. 퍼센트 계산
        Map<String, Double> percentages = new HashMap<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            double percent = (entry.getValue() / (double) total) * 100.0;
            percentages.put(entry.getKey(), Math.round(percent * 10) / 10.0); // 소수점 1자리
        }

        // 3. 저장 (userId는 null 또는 테스트용 고정 값으로)
        SurveyResult result = new SurveyResult(null, answers, percentages);
        repository.save(result);

        return percentages;
    }
}
