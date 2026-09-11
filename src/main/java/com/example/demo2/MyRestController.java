package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/myStudy")
    public SchoolClass myStudy(){
        SchoolClass sc = new SchoolClass();
        sc.addSubject("Chinese");
        sc.addSubject("English");
        sc.addSubject("Math");
        return sc;
    }
}
