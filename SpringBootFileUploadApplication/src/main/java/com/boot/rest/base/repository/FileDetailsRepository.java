package com.boot.rest.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.rest.base.model.FileDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface FileDetailsRepository extends JpaRepository<FileDetails, Integer> {

}
