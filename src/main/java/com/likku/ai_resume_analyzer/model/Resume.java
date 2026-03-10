package com.likku.ai_resume_analyzer.model;

import jakarta.persistence.*;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @Column(length = 5000)
    private String skills;

    private int matchScore;

}