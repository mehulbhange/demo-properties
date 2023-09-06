package com.demo.demoproperties.service;

import com.demo.demoproperties.Repository.UserPropertyRepo;
import com.demo.demoproperties.model.UserProperty;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PropertyService {

    Logger logger = LoggerFactory.getLogger(PropertyService.class);

    @Autowired
    private UserPropertyRepo userRepo;

    public List<UserProperty> getAllProperties(){
        logger.info("Called getAllProperties function");
        return userRepo.findAll();
    }

    public UserProperty createProperty(UserProperty userProperty){
        logger.info("Called createProperty method");
        logger.info("User property {} ", userProperty);
        return userRepo.save(userProperty);
    }


}
