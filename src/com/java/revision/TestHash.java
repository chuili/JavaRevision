package com.java.revision;

import com.java.revision.hash.Car;

import java.util.HashSet;
import java.util.Set;

public class TestHash {

    public static void testHash() {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setId(1234);

//        Car car2 = car1;

        Car car2 = new Car();
        car2.setColor("red");
        car2.setId(1234);

        if (car1 == car2) {
            System.out.println("car1 == car2 is true");
        }

        if (car1.hashCode() == car2.hashCode()) {
            System.out.println("hashCode are same");
        }

        if (car1.equals(car2)) {
            System.out.println("car1.equals(car2) is true");
        }
    }

    public static void testHashSet() {
        Set<Car> carSet = new HashSet<>();

        Car car1 = new Car();
        car1.setColor("red");
        car1.setId(1234);

        Car car2 = new Car();
        car2.setColor("red");
        car2.setId(1234);

        if (!carSet.contains(car1)) {
            carSet.add(car1);
            System.out.println("car1 added");
        }

        if (!carSet.contains(car2)) {
            carSet.add(car2);
            System.out.println("car2 added");
        }

        car2.setColor("blue");
        car2.setId(2345);

        carSet.iterator().forEachRemaining(x -> System.out.println(x.getId() + " " + x.getColor()));
    }
}
