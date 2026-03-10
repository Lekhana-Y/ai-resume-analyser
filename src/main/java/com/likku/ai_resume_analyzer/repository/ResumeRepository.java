package com.likku.ai_resume_analyzer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.likku.ai_resume_analyzer.model.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
