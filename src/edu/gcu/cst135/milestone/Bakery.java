package edu.gcu.cst135.milestone;

public class Bakery {
	
	public void open() {
		Bread bread1 = new Bread(325, 4000, "white", 100, "wheat", "loaf");
		Donut donut1 = new Donut(325, 250, "chocolate", 102);
		Cookie cookie1 = new Cookie(375, 175, "peanut butter", 103);
		System.out.println(bread1);
		System.out.println(donut1);
		System.out.println(cookie1);
	}

}
