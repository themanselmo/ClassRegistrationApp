package com.example.classregistrationapp.model;

public class demo  {
    public static void main(String[]args){

        // Accounts
        Account acct1= new Account("test1@gmail.com", "123");
        Account acct2 = new Account("test2@gmail.com", "123");
        Account acct3 = new Account("test3@gmail.com", "123");
        Account acct4 = new Account("test4@gmail.com", "123");

        // Courses
        Course c1 = new Course("MAT100","MathMan","100");
        Course c2 = new Course("MAT200","MathMan","110");
        Course c3 = new Course("MAT300","MathMan","120");
        Course c4 = new Course("SCI100","SciMan","130");
        Course c5 = new Course("SCI200","SciMan","140");

        Registrator registrator = new Registrator();
        registrator.getAccountMap().insert(acct1);
        registrator.getAccountMap().insert(acct2);
        registrator.getAccountMap().insert(acct3);
        registrator.getAccountMap().insert(acct4);

        registrator.getCourseMap().insert(c1);
        registrator.getCourseMap().insert(c2);
        registrator.getCourseMap().insert(c3);
        registrator.getCourseMap().insert(c4);
        registrator.getCourseMap().insert(c5);

        // Testing display contents for account and course bags
        registrator.getCourseMap().displayCourses();
        System.out.println();
        registrator.getAccountMap().displayContents();
    }


}
