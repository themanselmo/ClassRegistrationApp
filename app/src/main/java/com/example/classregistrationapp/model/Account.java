package com.example.classregistrationapp.model;


public class Account {
    private String fName;
    private String lName;
    private String ID;
    private String gender;
    private String userName;
    private String password;
    private double GPA;

    public Account(String fName, String lName, String userName) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
    }

    public Account(String fName, String lName, String userName, boolean isMale) {
        super();
        if (isMale == true) {
            this.gender = "Male";
        } else {
            this.gender = "Female";
        }
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Account [fName=" + fName + ", lName=" + lName + ", ID=" + ID + ", gender=" + gender + ", userName="
                + userName + ", password=" + password + ", GPA=" + GPA + "]";
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

}