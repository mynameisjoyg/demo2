package com.example.demo2;

import java.util.ArrayList;

public class SchoolClass {
    public ArrayList<String> allSubjects = new ArrayList<String>();

    public void addSubject(String sb){
        allSubjects.add(sb);
    }

    public ArrayList<String> getAllSubjects(){
        return allSubjects;
    }

}
