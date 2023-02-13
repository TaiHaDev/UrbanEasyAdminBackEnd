package com.example.urbaneasytt.controller;

import com.example.urbaneasytt.entity.Property;
import com.example.urbaneasytt.model.PropertyPayload;
import com.example.urbaneasytt.model.PropertyRequestPayload;
import com.example.urbaneasytt.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PropertyController {
    @Autowired
    PropertyRepository propertyRepository;

    @PostMapping("/property")
    PropertyPayload getProperty() {
        List<Property> propertyList =  propertyRepository.findAll();
        return new PropertyPayload(propertyList, propertyList.size());
    }

    @PostMapping("/property/update")
    void updateProperty(@RequestBody PropertyRequestPayload propertyRequestPayload) {
        propertyRepository.save(propertyRequestPayload.getKey());
    }
    @PostMapping("/property/remove")
    void removeProperty(@RequestBody PropertyRequestPayload propertyRequestPayload) {
       Property targetedProperty = propertyRequestPayload.getKey();
       propertyRepository.delete(targetedProperty);
    }

}
