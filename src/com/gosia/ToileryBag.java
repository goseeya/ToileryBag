package com.gosia;

public class ToileryBag implements Cloneable {

    public static void main(String[] args) {
	EyeShadow summerSky;
	summerSky = new EyeShadow("Summer sky", 10, 2020, 10, 9);
	EyeShadow springGrass = new EyeShadow("Spring grass", 14, 2020, 10, 4);
	springGrass.increasePrice();
	if (springGrass.luxurious())
	    System.out.println(springGrass.getName() + " is luxury");

	summerSky.setName("Cold flash");

	try {
		EyeShadow summerSkyCopy = summerSky.clone();
		System.out.println("copy of summerSky= " + summerSkyCopy);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}

	System.out.println(summerSky.getName() + " you can by for " + summerSky.getPrice() + " dollars.");

	ShinyEyeShadow icyFlash = new ShinyEyeShadow("Icy Flash", 60, 23, 2020, 4, 2);
	icyFlash.increasePrice();
	if (icyFlash.luxurious())
		System.out.println(icyFlash.getName() + " is luxurious.");
	System.out.println(icyFlash.getName() + " has a hardness of " + icyFlash.getHardness() + ".");

	ShinyEyeShadow diamond = new ShinyEyeShadow("Diamond", 99, 38, 2019, 12, 12);
	ShinyEyeShadow jewel = new ShinyEyeShadow("Diamond", 99, 38, 2019, 12, 12);
	diamond.increasePrice();
	jewel.increasePrice();
	System.out.println("diamond.toString(): " + diamond);
	System.out.println("diamond.equals(jewel): " + diamond.equals(jewel));
	System.out.println("diamond.hashCode(): " + diamond.hashCode());

	ShinyEyeShadow[] shinyEyeShadowsSet = new ShinyEyeShadow[2];

	shinyEyeShadowsSet[0] = diamond;
	shinyEyeShadowsSet[1] = new ShinyEyeShadow("Blink blink", 120, 30, 2020, 11, 28);

	for (ShinyEyeShadow s : shinyEyeShadowsSet)
		System.out.println(s);
	}

}
