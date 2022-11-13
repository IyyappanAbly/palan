package com.deloitte.jpa.controller;

import com.deloitte.jpa.entity.EmployeeRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {



    @PostMapping(value = "/addEmployee", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public void addEmployee(@ModelAttribute EmployeeRequest employeeRequest){
        System.out.println(employeeRequest.getMultipartFile().getOriginalFilename());
        System.out.println(employeeRequest.getMultipartFile().getSize());

        System.out.println(employeeRequest);

    }
}



