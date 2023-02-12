package com.example.urbaneasytt.controller;

import com.example.urbaneasytt.entity.Property;
import com.example.urbaneasytt.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {
    @Autowired
    PropertyRepository propertyRepository;

    @GetMapping("/property")
    List<Property> getProperty() {
        return propertyRepository.findAll();
    }

}
