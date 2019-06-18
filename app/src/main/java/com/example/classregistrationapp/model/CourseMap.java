package com.example.classregistrationapp.model;

import java.util.HashMap;
import java.util.Map;

public class CourseMap {
    private HashMap<String, Course> myMap;
    private int nElems;

    public CourseMap(int size){
        myMap = new HashMap<>(size);
        nElems = 0;
    }

    public void displayCourses(){
        for(Map.Entry<String,Course> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue().toString());
        }
    }

    public void insert(Course course){
        if(!myMap.containsKey(course.getCrnNumber())) {
           myMap.put(course.getCrnNumber(), course);
           nElems++;
        } else {
            System.out.println("Course exists");
        }
    }

    public Course findByKey(String crnNumber){
        if(myMap.containsKey(crnNumber)) {
            return myMap.get(crnNumber);
        } else {
            System.out.println("Course doesn't exist");
            return null;
        }
    }
}
