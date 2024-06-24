package com.telusko.app;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling in a Desktop");
    }
}
