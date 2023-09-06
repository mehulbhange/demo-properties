package com.demo.demoproperties.service;

import com.demo.demoproperties.Repository.UserPropertyRepo;
import com.demo.demoproperties.model.UserProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private UserPropertyRepo userRepo;

    public List<UserProperty> getAllProperties(){
        return userRepo.findAll();
    }

    public UserProperty createProperty(UserProperty userProperty){
        System.out.println(userProperty);
        return userRepo.save(userProperty);
    }


}
