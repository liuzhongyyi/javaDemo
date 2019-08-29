package com.lzy.demo24;

public class badFactory extends StaticFactory {
    @Override
    Food createFood(String type) {
        Food food = null;
        if (type == "special bad") {
            food = new badFood();

        } else if (type == "very nice") {
            food = new verBadFood();

        }
        return food;
    }
}



