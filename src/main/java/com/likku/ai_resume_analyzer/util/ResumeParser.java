package com.likku.ai_resume_analyzer.util;

import org.apache.tika.Tika;
import org.springframework.web.multipart.MultipartFile;

public class ResumeParser {

    public static String parse(MultipartFile file) {

        try {

            Tika tika = new Tika();

            String text = tika.parseToString(file.getInputStream());

            System.out.println("===== EXTRACTED TEXT =====");
            System.out.println(text);

            return text.toLowerCase();

        } catch (Exception e) {

            e.printStackTrace();
            return "";
        }

    }

}