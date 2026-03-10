package com.likku.ai_resume_analyzer.service;
import org.apache.tika.Tika;
import com.likku.ai_resume_analyzer.util.ResumeParser;
import com.likku.ai_resume_analyzer.util.SkillExtractor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ResumeService {

    public String parseResume(MultipartFile file) {

        try {

            Tika tika = new Tika();

            return tika.parseToString(file.getInputStream());

        } catch(Exception e){

            e.printStackTrace();
            return "";
        }
    }

    public List<String> extractSkills(String text){
        return SkillExtractor.extractSkills(text);
    }
}

