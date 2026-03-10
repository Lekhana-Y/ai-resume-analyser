package com.likku.ai_resume_analyzer.util;

import java.util.*;

public class SkillExtractor {

    private static final List<String> SKILLS = Arrays.asList(
            "java",
            "spring boot",
            "node.js",
            "react",
            "mongodb",
            "mysql",
            "docker",
            "html",
            "css",
            "javascript",
            "git",
            "rest api"
    );

    public static List<String> extractSkills(String text) {

        List<String> found = new ArrayList<>();

        String lowerText = text.toLowerCase();

        for(String skill : SKILLS){

            if(lowerText.contains(skill.toLowerCase())){
                found.add(skill);
            }

        }

        return found;
    }
}