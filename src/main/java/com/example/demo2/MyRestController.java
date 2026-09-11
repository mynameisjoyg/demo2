package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyRestController {

    @RequestMapping("/myStudy")
    public ArrayList<String> myStudy(){
        SchoolClass sc = new SchoolClass();
        sc.addSubject("Chinese");
        sc.addSubject("English");
        sc.addSubject("Math");
        return sc.getAllSubjects();
    }

    @RequestMapping("/addSubj")
    public ArrayList<String> addSubj(@RequestParam String sub) {
        SchoolClass sc = new SchoolClass();
        sc.addSubject(sub);
        return sc.getAllSubjects();
    }
}
