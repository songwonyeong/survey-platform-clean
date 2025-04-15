package com.example.survey_platform.mongo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Getter
@Setter
@Document(collection = "surveys_results")
public class SurveyResponse {
    @Id
    private String id;

    private Map<String, String> answers; // 질문 ID와 선택한 값
    private String submittedAt;
}
