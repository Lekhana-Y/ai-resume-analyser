# 🚀 AI Resume Analyzer

An intelligent **Spring Boot web application** that analyzes uploaded resumes, extracts skills, calculates an ATS-style score, and highlights missing skills.

The application parses PDF resumes using **Apache Tika**, detects technical skills, and displays insights through an interactive UI dashboard.

---

## ✨ Features

### 📄 Resume Parsing
- Upload a **PDF resume**
- Extract text automatically using **Apache Tika**

### 🧠 Skill Detection
Automatically detects common technical skills such as:

- Java  
- Spring Boot  
- React  
- Node.js  
- MongoDB  
- MySQL  
- Docker  
- REST APIs  
- HTML  
- CSS  
- JavaScript  

### 📊 ATS Score Calculation
Calculates a simple **ATS-style resume score** based on detected skills.

Example output:

Detected Skills
Java
Spring Boot
React
MongoDB

ATS Score
80 / 100

Resume Length
3200 characters


### 🔍 Missing Skill Detection

Highlights important skills that may be missing from the resume.

Example:
Missing Skills
Docker
AWS
Microservices

---

## 🏗️ Project Structure

ai-resume-analyser
│
├── src
│ ├── controller
│ │ └── ResumeController.java
│ │
│ ├── service
│ │ └── ResumeService.java
│ │
│ ├── util
│ │ ├── ResumeParser.java
│ │ └── SkillExtractor.java
│ │
│ ├── model
│ │ └── Resume.java
│ │
│ └── resources
│ └── static
│ └── index.html
│
├── pom.xml
└── mvnw


---

## ⚙️ How It Works

### 1️⃣ Upload Resume
The user uploads a **PDF resume** through the web interface.

### 2️⃣ Backend Processing

Spring Boot API endpoint:
POST /api/resume/analyze
Processing Steps:

1. Resume uploaded as `MultipartFile`
2. **Apache Tika** extracts text from the PDF
3. **SkillExtractor** scans for known technical skills
4. ATS score is calculated
5. Results returned as JSON




💻 Installation & Running Locally
Clone the repository
git clone https://github.com/Lekhana-Y/ai-resume-analyser.git
Navigate into project
cd ai-resume-analyser
Run the application

Linux / Mac:

./mvnw spring-boot:run

Windows:

mvnw.cmd spring-boot:run
Open the application
http://localhost:8080

Upload a resume and click Analyze Resume.
🌟 Future Improvements

Job Description Matching

Skill Gap Analysis

Resume Improvement Suggestions

Resume Score Visualization (Charts)

Downloadable Analysis Report

AI Feedback using LLM APIs

🎯 Learning Outcomes

This project demonstrates:

REST API development using Spring Boot

Resume parsing using Apache Tika

Backend–frontend integration

Skill extraction from document text

Git version control and GitHub project management

👩‍💻 Author

Lekhana Y

GitHub:
https://github.com/Lekhana-Y

<img width="1536" height="1024" alt="ChatGPT Image Mar 10, 2026, 03_55_26 PM" src="https://github.com/user-attachments/assets/b6f9ce4e-d397-41f0-8a1a-40e5ea7c6efe" />
Example response:

```json
{
  "skills": ["Java","Spring Boot","React"],
  "missingSkills": ["Docker","AWS"],
  "score": 75,
  "resumeTextLength": 2400
}

