package com.zx.ssm.service;

import com.zx.ssm.mapper.StudentsMapper;
import com.zx.ssm.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentsMapper studentsMapper;

    public List<Students> getStu(){

        return studentsMapper.selectStu();
    }
}
