package com.vk.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    @Autowired
    Laptop laptop;
    public void con(){
        System.out.println("Spring boot");
        laptop.compile();
    }
}
