package com.example.classregistrationapp.model;

import java.util.ArrayList;

public class Account {
    private String userName;
    private String password;
    private ArrayList<Course> courseList;
    private int numberOfCourses;

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.courseList = new ArrayList<>();
        this.numberOfCourses = 0;
    }

    public void addCourse(Course course){
        courseList.add(course);
        numberOfCourses++;
    }

    public void displayCourses(){
        for(int i = 0; i < numberOfCourses; i++){
            System.out.println(courseList.get(i).toString());
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}