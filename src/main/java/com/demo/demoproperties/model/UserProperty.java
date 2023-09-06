package com.demo.demoproperties.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserProperty {

    @Id
    private Long _id;
    private String name;
    private String city;
    private String pincode;

}
