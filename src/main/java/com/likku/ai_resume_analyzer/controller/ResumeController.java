
package com.likku.ai_resume_analyzer.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.*;
import com.likku.ai_resume_analyzer.service.ResumeService;

@RestController
@RequestMapping("/api/resume")
public class ResumeController {

    private final ResumeService service;

    public ResumeController(ResumeService service) {
        this.service = service;
    }

    @PostMapping("/analyze")
    public Map<String, Object> analyzeResume(@RequestParam("file") MultipartFile file) {

        Map<String, Object> response = new HashMap<>();

        try {

            if (file.isEmpty()) {
                response.put("error", "File is empty");
                return response;
            }

            String text = service.parseResume(file);

            List<String> skills = service.extractSkills(text);

            // Example missing skills
            List<String> missingSkills = List.of("Spring Boot", "Docker", "AWS");

            // Simple ATS score
            int score = Math.min(100, skills.size() * 10);

            response.put("skills", skills);
            response.put("missingSkills", missingSkills);
            response.put("score", score);
            response.put("resumeTextLength", text.length());

        } catch (Exception e) {
            e.printStackTrace();
            response.put("error", "Failed to analyze resume: " + e.getMessage());
        }

        return response;
    }
}