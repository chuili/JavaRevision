package com.java.revision.hash;

import java.util.Objects;

public class Car {
    private String color;
    private int id;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, id);
    }
}
