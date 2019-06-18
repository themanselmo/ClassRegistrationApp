package com.example.classregistrationapp.model;

public class Course {
    private String courseName;
    private String professorName;
    private String crnNumber;

    public Course(String courseName, String professorName, String crnNumber){
        this.courseName = courseName;
        this.professorName = professorName;
        this.crnNumber = crnNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getCrnNumber() {
        return crnNumber;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", crnNumber='" + crnNumber + '\'' +
                '}';
    }
}
