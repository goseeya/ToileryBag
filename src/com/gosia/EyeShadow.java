package com.gosia;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class EyeShadow implements Cloneable {
    private String name;
    private int price;
    private Date productionDay;


    public EyeShadow (String n, int p, int year, int month, int day) {
        name = n;
        price = p;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        productionDay = calendar.getTime();
    }

    public EyeShadow clone() throws CloneNotSupportedException {
        // call Object.clone()
        EyeShadow cloned = (EyeShadow) super.clone();

        // clone mutable fields
        cloned.productionDay = (Date) productionDay.clone();

        return cloned;
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

        // check if the classes match
        if (getClass() != otherObject.getClass())
            return false;

        EyeShadow other = (EyeShadow) otherObject;

        return Objects.equals(name, other.name) && price == other.price && Objects.equals(productionDay, other.productionDay);
    }

    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ", price=" + price + ", productionDay=" + productionDay + "]";
    }
}
