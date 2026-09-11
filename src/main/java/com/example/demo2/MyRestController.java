package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping("/study")
    public SchoolClass study(){
        SchoolClass sc = new SchoolClass();
        sc.setSchoolClassName("Chinese");
        return sc;
    }
}
