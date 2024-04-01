package com.vk.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Aliean {
    @Value("34")
    private int age;
    private Computer comp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }
@Autowired
@Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        comp.compile();
    }
}
