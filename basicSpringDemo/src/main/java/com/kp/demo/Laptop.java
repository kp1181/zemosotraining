package com.kp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    @Autowired
    private Processor processor;

    public Laptop(Processor processor) {
        super();
        this.processor = processor;
    }

    public String produceLaptop(){
        String laptopDescription = processor.useProcessor();
        return laptopDescription;
    }
}
