package com.lzy.demo04;

import lombok.Getter;
import lombok.Setter;

public class Reflect {

    void contactString() {

    }


}

@Setter
@Getter
class Person {
    private String name;
    private int old;
    private String addrees;
}
