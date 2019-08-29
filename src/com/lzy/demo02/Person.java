package com.lzy.demo02;

import lombok.Getter;
import lombok.Setter;
import lombok.Synchronized;

import java.io.Serializable;

@Setter
@Getter
public class Person implements Serializable {
    private String name;
    private int old;

    public Person() {
    }

    public Person(String name, int old) {
        this.name = name;
        this.old = old;
    }


}
