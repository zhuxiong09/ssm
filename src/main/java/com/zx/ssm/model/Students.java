package com.zx.ssm.model;

public class Students {
    private Integer id;
    private String stuNum;
    private String stuName;
    private Integer gradeID;
    private String address;

    private Classes classes;

    public Students(){}
    public Students(Integer id, String stuNum, String stuName, Integer gradeID, String address) {
        this.id = id;
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.gradeID = gradeID;
        this.address = address;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", gradeID=" + gradeID +
                ", address='" + address + '\'' +
                '}';
    }
}
