package com.example.survey_platform.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SurveyResponseRepository extends MongoRepository<SurveyResponse, String> {
}
