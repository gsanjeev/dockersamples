package com.laxtech.example.repository;

import com.laxtech.example.model.LogRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<LogRecord, String>{
    
}
