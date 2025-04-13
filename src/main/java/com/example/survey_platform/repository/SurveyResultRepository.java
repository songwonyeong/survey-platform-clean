package com.example.survey_platform.repository;

import com.example.survey_platform.model.SurveyResult;
import com.example.survey_platform.repository.SurveyResultRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyResultRepository extends MongoRepository<SurveyResult, String> {
}
