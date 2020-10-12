package com.zx.ssm.controller;

import com.zx.ssm.model.Students;
import com.zx.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String stu(Map<String,Object> map){
        List<Students> stus = studentService.getStu();
        map.put("students",stus);
        return "index";
    }
}
