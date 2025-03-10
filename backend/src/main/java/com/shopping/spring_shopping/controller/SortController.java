package com.shopping.spring_shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SortController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 클릭된 sort 값에 대해 SQL 쿼리를 실행
    @PostMapping("/query")
    public List<Map<String, Object>> getQueryResults(@RequestBody SortRequest request) {
        String sort = request.getSort();
        
        // 예시 쿼리: 'sort' 값을 기반으로 데이터 조회
        String sql = "SELECT * FROM products WHERE category = ?";
        
        // 쿼리 실행
        return jdbcTemplate.queryForList(sql, sort);
    }
    
    // SortRequest 클래스
    public static class SortRequest {
        private String sort;

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }
    }
}