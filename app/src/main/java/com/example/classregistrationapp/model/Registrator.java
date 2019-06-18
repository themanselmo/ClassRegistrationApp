package com.example.classregistrationapp.model;

public class Registrator {
    // have a list of premade accounts inserted on startup
    // for testing
    private AccountMap accountMap;
    private CourseMap courseMap;

    public Registrator(){
        accountMap = new AccountMap(300);
        courseMap = new CourseMap(300);
    }

    public AccountMap getAccountMap() {
        return accountMap;
    }

    public CourseMap getCourseMap() {
        return courseMap;
    }
}
