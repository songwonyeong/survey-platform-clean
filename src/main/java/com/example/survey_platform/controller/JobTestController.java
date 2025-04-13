//package com.example.survey_platform.controller;
//
//import com.example.survey_platform.service.SurveyService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class JobTestController {
//
//    private final SurveyService surveyService;
//
//    @PostMapping("/calculate")
//    public Map<String, Double> calculateScores(
//            @RequestParam("userId") Long userId,
//            @RequestBody Map<String, String> answers
//    ) {
//        return surveyService.calculateAndSave(answers);
//    }
//}
