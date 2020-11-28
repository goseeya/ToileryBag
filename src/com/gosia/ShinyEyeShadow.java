package com.gosia;

public class ShinyEyeShadow extends EyeShadow {
    private int hardness;
    public ShinyEyeShadow(String n, int p, int h, int year, int month, int day) {
        super(n, p, year, month, day);
        hardness = h;
    }
    public void hardens (int hardensBy) {
        if (hardensBy <= 0)
            return;
        hardness += hardensBy;
    }
    public int getHardness() {
        return hardness;
    }

    public void setHardness(int newHardness) {
        hardness = newHardness;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
            return false;
        ShinyEyeShadow other = (ShinyEyeShadow) otherObject;
        // super.equals checked that this and other belong to the same class
        return hardness == other.hardness;
    }

    public int hashCode() {
        // 17 is liczba pierwsza
        return super.hashCode() + 17 * Integer.valueOf(hardness).hashCode();
    }

    public String toString() {
        return super.toString() + "[hardness=" + hardness + "]";
    }

}
