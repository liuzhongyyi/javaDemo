package com.lzy.demo24;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import org.apache.commons.lang3.ObjectUtils;

public class niceFactory extends StaticFactory {
    @Override
    Food createFood(String type) {
        Food food = null;
        if (type == "special nice") {
            food = new SpicialiNiceFood();
            return food;
        } else if (type == "very nice") {
            food = new VeryNiceFood();
            return food;
        }
        return null;
    }

}
