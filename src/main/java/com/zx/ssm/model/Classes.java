package com.zx.ssm.model;

import java.util.List;

public class Classes {
    private Integer id;
    private String classes;
    private List<Students> students;

    public Classes(){}

    public Classes(Integer id, String classes) {
        this.id = id;
        this.classes = classes;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Classes: {" +
                "id=" + id +
                ", classes='" + classes + '\'' +
                '}';
    }
}
