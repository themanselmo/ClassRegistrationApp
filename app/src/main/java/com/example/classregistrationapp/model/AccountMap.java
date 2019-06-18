package com.example.classregistrationapp.model;


import java.util.HashMap;

public class AccountMap<K,V> {
    private HashMap<String, Account> myMap;
//    private AccountGenerator ag;
    private PasswordChecker pc;
    private int nElems;

    public AccountMap(int size) {
        myMap = new HashMap<>(size);
        nElems = 0;
//        ag = new AccountGenerator();
        pc = new PasswordChecker();
    }

    public void insert(Account account) {
        if(!myMap.containsKey(account.getUserName())) {
            myMap.put(account.getUserName(), account);
        } else {
            System.out.println("username exists");
        }
    }

    public Account findByKey(String username) {
        if(myMap.containsKey(username)) {
            return myMap.get(username);
        } else {
            System.out.println("Account doesnt exist");
            return null;
        }
    }

    public boolean contains(String key) {
        if(myMap.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

    public void displayContents() {
        for(String s : myMap.keySet()) {
            String key = s.toString();
            String value = myMap.get(key).toString();
            System.out.println(key + " " + value);
        }
    }

    public String displayContentsToString() {
        String toreturn = "";
        for(String s : myMap.keySet()) {
            String key = s.toString();
            String value = myMap.get(key).toString();
            toreturn += key + " " + value + "\n";
        }
        return toreturn;
    }

//    public void generateAccounts(int numberOfAccounts) {
//        for (int i = 0; i < numberOfAccounts; i++) {
//            insert(ag.generateAccount());
//        }
//    }

    // @TODO
    public boolean checkForRepeatID() {

        return false;
    }


    public PasswordChecker getPc() {
        return pc;
    }



}
