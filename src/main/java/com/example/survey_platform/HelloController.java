package com.example.survey_platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러,레포지토리 합친 것 -> 문자열 응답을 반환한다.
public class HelloController {

    @GetMapping("/hello") // get 방식으로 /hello라는 url 요청이 오면 실행됨.
    public String hello() {
        return "Hello, Spring Boot!";
    }
}