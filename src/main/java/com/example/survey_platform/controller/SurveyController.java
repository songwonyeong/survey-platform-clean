package com.example.survey_platform.controller;

import com.example.survey_platform.service.SurveyService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class SurveyController {

    private final SurveyService service;

    public SurveyController(SurveyService service) {
        this.service = service;
    }

    @PostMapping("/calculate")
    public Map<String, Double> calculate(@RequestBody Map<String, String> answers) {
        return service.calculateAndSave(answers);
    }
}
