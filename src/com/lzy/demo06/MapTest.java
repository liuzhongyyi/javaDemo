package com.lzy.demo06;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //放置一个键值对到map
        map.put("zs", 1);
        // 移除张三的键
        map.remove("zs");
        //是否包含zs这个键
        map.containsKey("zs");
        //返回键值对数量
        map.size();
        //mao是否为空
        map.isEmpty();
        //返回所有的键
        map.keySet();
        //返回所有的键值对
        map.entrySet();
    }
}
