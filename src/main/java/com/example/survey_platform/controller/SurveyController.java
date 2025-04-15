//package com.example.survey_platform.controller;
//
//import com.example.survey_platform.service.SurveyService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api")
//public class SurveyController {
//
//    private final SurveyService service;
//
//    public SurveyController(SurveyService service) {
//        this.service = service;
//    }
//
//    @PostMapping("/calculate")
//    public Map<String, Double> calculate(@RequestBody Map<String, String> answers) {
//        return service.calculateAndSave(answers);
//    }
//}
package com.example.survey_platform.controller;

import com.example.survey_platform.mongo.SurveyResponse;
import com.example.survey_platform.mongo.SurveyResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api/survey")
@CrossOrigin(origins = "*")
public class SurveyController {

    @Autowired
    private SurveyResponseRepository repository;

    @PostMapping("/submit")
    public String submitSurvey(@RequestBody Map<String, String> answers) {
        SurveyResponse response = new SurveyResponse();
        response.setAnswers(answers);
        response.setSubmittedAt(LocalDateTime.now().toString());
        repository.save(response);
        return "success";
    }
}
