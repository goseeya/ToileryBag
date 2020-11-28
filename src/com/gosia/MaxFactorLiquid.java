package com.gosia;

public class MaxFactorLiquid extends LiquidEyeShadow implements CanIrritate {
    public MaxFactorLiquid(String n, int p, int year, int month, int day) {
        super(n, p, year, month, day);
    }
    public void pourOut() {
        System.out.println("MaxFactor pouerd out!");
    }

    public void irritate() {
        System.out.println("The skin is irritated!");
    }
}
