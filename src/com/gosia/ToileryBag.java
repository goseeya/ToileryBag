package com.gosia;

public class ToileryBag {

    public static void main(String[] args) {
	EyeShadow summerSky;
	summerSky = new EyeShadow("Summer sky", 10);
	EyeShadow springGrass = new EyeShadow("Spring grass", 14);
	springGrass.increasePrice();
	if (springGrass.luxurious())
	    System.out.println(springGrass.getName() + " is luxury");

	summerSky.setName("Cold flash");
	System.out.println(summerSky.getName() + " you can by for " + summerSky.getPrice() + " dollars.");

	ShinyEyeShadow icyFlash = new ShinyEyeShadow("Icy Flash", 60, 23);
	icyFlash.increasePrice();
	if (icyFlash.luxurious())
		System.out.println(icyFlash.getName() + " is luxurious.");
		System.out.println(icyFlash.getName() + " has a hardness of " + icyFlash.getHardness() + ".");

	EyeShadow diamond = new ShinyEyeShadow("Diamond", 99, 38);
	EyeShadow jewel = new ShinyEyeShadow("Diamond", 99, 38);
	diamond.increasePrice();
	jewel.increasePrice();
	System.out.println("diamond.toString(): " + diamond);
	System.out.println("diamond.equals(jewel): " + diamond.equals(jewel));
	System.out.println("diamond.hashCode(): " + diamond.hashCode());
	}




}
