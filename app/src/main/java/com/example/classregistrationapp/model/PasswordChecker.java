package com.example.classregistrationapp.model;

public class PasswordChecker {

    // returns true if valid
    public boolean verifyPassword(String password) {
        if (isLong(password) && hasLowerCase(password) && hasUpperCase(password) && hasNumber(password)
                && hasSymbol(password)) {
            return true;
        }
        return false;
    }

    public boolean isLong(String password) {
        if (password.length() < 8) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasLowerCase(String password) {
        if (!password.equals(password.toUpperCase())) {
            return true;
        }
        return false;
    }

    public boolean hasUpperCase(String password) {
        if (!password.equals(password.toLowerCase())) {
            return true;
        }
        return false;
    }

    public boolean hasNumber(String password) {
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumeric(ch)) {
                numCount++;
            }
        }
        if (numCount > 0) {
            return true;
        }
        return false;
    }

    public boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }

    public boolean hasSymbol(String password) {
        if (!password.matches("[A-Za-z0-9 ]*")) {
            return true;
        } else {
            return false;
        }
    }

}
