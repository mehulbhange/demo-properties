package com.demo.demoproperties.controller;

import com.demo.demoproperties.model.UserProperty;
import com.demo.demoproperties.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserPropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("health")
    public String hello(){
        return "I'm healthy !!!";
    }

    @PostMapping("/property")
    public ResponseEntity<UserProperty> createUser(@RequestBody UserProperty userProperty){
        UserProperty up = propertyService.createProperty(userProperty);
        return ResponseEntity.ok(up);
    }

    @GetMapping("/property")
    public ResponseEntity<List<UserProperty>> getAllProperties(){
        return ResponseEntity.ok(propertyService.getAllProperties());
    }

}
