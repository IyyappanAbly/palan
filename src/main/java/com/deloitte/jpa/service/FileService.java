package com.deloitte.jpa.service;

import com.deloitte.jpa.entity.File;
import com.deloitte.jpa.repository.FileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Random;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;


    private Logger logger = LoggerFactory.getLogger(FileService.class);

    static int id =1;
    public void addFile(MultipartFile multipartFile) throws Exception{


        File file = new File();

        file.setId(id);
        file.setFileName(multipartFile.getOriginalFilename());
        file.setFileData(multipartFile.getBytes());

        logger.info("File Data : {}", file);

        logger.info("file size : {}",multipartFile.getSize());

        logger.info("size : {}",multipartFile.getBytes().length );
        fileRepository.save(file);
        id++;
    }

    public byte[] getFile(String name) throws Exception{

        File file =fileRepository.findByFileName(name);

        byte[] arr = file.getFileData();


        java.io.File fi = new java.io.File("D://DummyFolder/"+name+".txt");
           try(FileOutputStream fo = new FileOutputStream(fi)){
              fo.write(arr);
           }

           return arr;

    }

}
