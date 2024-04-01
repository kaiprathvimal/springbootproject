package com.vk.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
//    Cpu cpu;
    public void  compile() {
        System.out.println("Compiling");
//        cpu.runTask();
    }
}
