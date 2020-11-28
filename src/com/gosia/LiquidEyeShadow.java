package com.gosia;

public abstract class LiquidEyeShadow extends EyeShadow {
    abstract void pourOut();
    public LiquidEyeShadow(String n, int p, int year, int month, int day) {
        super(n, p, year, month, day);
    };
}
