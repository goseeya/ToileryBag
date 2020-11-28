package com.gosia;

import java.util.Date;
import java.util.Objects;

public class EyeShadow {
    private String name;
    private int price;

    public EyeShadow (String n, int p) {
        name = n;
        price = p;
    }

    public boolean luxurious() {
        if (price > 50)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void increasePrice() {
        price++;
    }

    public boolean equals(Object otherObject) {
        // check if the objects are identical
        if (this == otherObject)
            return true;

        if (otherObject == null)
            return false;

        if (getClass() != otherObject.getClass())
            return false;

        EyeShadow other = (EyeShadow) otherObject;

        return Objects.equals(name, other.name) && price == other.price;
    }

    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ", price=" + price + "]";
    }
}
