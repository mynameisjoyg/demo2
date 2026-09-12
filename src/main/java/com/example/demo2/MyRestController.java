package com.example.demo2;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MyRestController {

    private final NamedParameterJdbcOperations namedParameterJdbcOperations;

    public MyRestController(NamedParameterJdbcOperations namedParameterJdbcOperations) {
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }

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

    @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        System.out.println("getAllStudents 呼叫中");
        String sql = "SELECT * FROM student";
        Map<String, Object> map = new HashMap<>();
        StudentRowMapper srm = new StudentRowMapper();
        List<Student> list = namedParameterJdbcOperations.query(sql, map, srm);
        return list;
    }
}
