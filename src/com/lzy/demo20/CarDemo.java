package com.lzy.demo20;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import java.util.Map;
import java.util.Set;

public class CarDemo {
    public static void printKey(Map<Car, Double> map) {
        Set<Car> cars = map.keySet();
        cars.stream().forEach(car -> System.out.println(car.getName()));
    }

    public static void getPrice(String name, Map<Car, Double> map) {
        Set<Car> cars = map.keySet();
        cars.stream().forEach(car -> {
            if (car.getName() == name) {
                System.out.println(map.get(car));
            }
        });
    }

    public static void discountCarPrice(Map<Car, Double> map) {
        for (Map.Entry<Car, Double> entry : map.entrySet()) {
            Double value = entry.getValue();
            map.put(entry.getKey(), value * 0.8);

        }
        map.forEach((key, value) -> {
            if (key.getName() == "宝马") {
                System.out.println(map.get(key));
            }
        });
    }


}

@Setter
@Getter
@ToString
class Car {
    private String name;
    private int speed;
}
