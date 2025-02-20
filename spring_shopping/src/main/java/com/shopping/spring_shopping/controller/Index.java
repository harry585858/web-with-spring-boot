package com.shopping.spring_shopping.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 클래스로 지정
public class Index {
    
    @GetMapping("/") // URL 경로를 "/"로 매핑
    public String index(Model model) {
        List<String> sorts = Arrays.asList("Electronics", "Clothes");
        model.addAttribute("sorts", sorts); // sorts 데이터를 모델에 추가
        return "index"; // index.html 파일로 반환
    }
}