package com.kp.demo;

import org.springframework.stereotype.Component;

@Component
public class I3 implements Processor{
    public String useProcessor(){
        return "i3 processor";
    }
}
