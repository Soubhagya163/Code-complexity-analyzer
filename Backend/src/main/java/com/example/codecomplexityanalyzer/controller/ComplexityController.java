package com.example.codecomplexityanalyzer.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/complexity")
@CrossOrigin(origins = "*") // allows frontend requests
public class ComplexityController {

    @PostMapping("/analyze")
    public Map<String, Object> analyzeCode(@RequestBody Map<String, String> request) {
        String code = request.get("code");
        Map<String, Object> response = new HashMap<>();

        // very simple detection logic
        if (code.contains("for") && code.contains("while")) {
            response.put("timeBest", "O(n^2)");
            response.put("timeAvg", "O(n^2)");
            response.put("timeWorst", "O(n^2)");
            response.put("spaceBest", "O(1)");
            response.put("spaceAvg", "O(1)");
            response.put("spaceWorst", "O(1)");
            response.put("summary", "Your code has nested loops, so time complexity is quadratic.");
        } else if (code.contains("for")) {
            response.put("timeBest", "O(n)");
            response.put("timeAvg", "O(n)");
            response.put("timeWorst", "O(n)");
            response.put("spaceBest", "O(1)");
            response.put("spaceAvg", "O(1)");
            response.put("spaceWorst", "O(1)");
            response.put("summary", "Your code has a single loop, so time complexity is linear.");
        } else {
            response.put("timeBest", "O(1)");
            response.put("timeAvg", "O(1)");
            response.put("timeWorst", "O(1)");
            response.put("spaceBest", "O(1)");
            response.put("spaceAvg", "O(1)");
            response.put("spaceWorst", "O(1)");
            response.put("summary", "Your code has no loops, so complexity is constant.");
        }

        return response;
    }
}
