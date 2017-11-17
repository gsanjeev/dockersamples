package com.laxtech.example.controller;

import com.laxtech.example.model.LogRecord;
import com.laxtech.example.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @Autowired
    MongoService mongoLoggerSerive;

    @RequestMapping("/")
    public String home() {
        mongoLoggerSerive.logToMongo(new LogRecord("INFO", "New Home page hit"));
        return "Spring Boot war deployment in Tomcat Docker Container successfull <P>" +
                mongoLoggerSerive.getMongoDbInfo();
    }

    @RequestMapping("/hits")
    public String getHomePageHits() {
        long homePageHitCount = mongoLoggerSerive.getHomePageHitCount();
        return "The Home page has been hit " +  homePageHitCount + " times";
    }
}
