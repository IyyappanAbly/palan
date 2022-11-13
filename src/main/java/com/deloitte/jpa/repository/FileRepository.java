package com.deloitte.jpa.repository;

import com.deloitte.jpa.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File,Integer> {
    File findByFileName(String fileName);
}
