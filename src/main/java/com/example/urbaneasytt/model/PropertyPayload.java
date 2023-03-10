package com.example.urbaneasytt.model;

import com.example.urbaneasytt.entity.Property;
import org.springframework.stereotype.Component;

import java.util.List;


public class PropertyPayload {
    private List<Property> result;
    private int count;
    public PropertyPayload(List<Property> result, int count) {
        this.result = result;
        this.count = count;
    }

    public List<Property> getResult() {
        return result;
    }

    public void setResult(List<Property> result) {
        this.result = result;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
