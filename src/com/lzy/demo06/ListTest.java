package com.lzy.demo06;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List list = new ArrayList();
        //张三被加入list集合
        list.add("张三");
        //张三被移除集合
        list.remove("张三");
        //获取0位置的元素
        list.get(0);
        //查找目标元素出现的下标
        list.indexOf("张三");
        //替换目标位置的元素
        list.set(0, "李四");
    }
}
