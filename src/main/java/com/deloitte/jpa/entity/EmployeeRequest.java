package com.deloitte.jpa.entity;

import org.springframework.web.multipart.MultipartFile;

public class EmployeeRequest {


    private Integer id;

    private String name;

    private int age;

    private MultipartFile multipartFile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", multipartFile=" + multipartFile +
                '}';
    }
}
