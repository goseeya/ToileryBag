package com.gosia;

public class MaxFactorLiquid extends LiquidEyeShadow implements CanIrritate {
    public MaxFactorLiquid(String n, int p) {
        super(n, p);
    }
    public void pourOut() {
        System.out.println("MaxFactor pouerd out!");
    }

    public void irritate() {
        System.out.println("The skin is irritated!");
    }
}
