package com.lzy.demo06;

import java.util.HashSet;
import java.util.Set;

public class SetTest extends Thread {
    public static void main(String[] args) {
        Set set = new HashSet();
        //添加元素
        set.add("张三");
        //判断是否为空
        set.isEmpty();
        //判断是否包含元素
        set.contains("张三");
        //得到容量
        set.size();
        //清空集合
        set.clear();


    }

    @Override
    public void run() {

    }
}
