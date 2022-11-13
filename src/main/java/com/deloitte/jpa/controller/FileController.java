package com.deloitte.jpa.controller;

import com.deloitte.jpa.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    private Logger logger = LoggerFactory.getLogger(FileController.class);

    @PostMapping(value="/addFile")
   public String addFile(@RequestParam("file") MultipartFile multipartFile) throws Exception{

     logger.info("File Name : {}", multipartFile.getOriginalFilename());
     fileService.addFile(multipartFile);

     return "File Added SuccessFully !!!!";
   }


   @GetMapping(value = "/getFile/{name}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
   public byte[] getFile(@PathVariable String name) throws Exception{

        byte[] arr = fileService.getFile(name);
        return arr;
   }


}
