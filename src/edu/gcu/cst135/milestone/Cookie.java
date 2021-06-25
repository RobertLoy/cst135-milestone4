package edu.gcu.cst135.milestone;

import java.io.Serializable;

public class Cookie extends BakedGood  implements Serializable{

	private Topping topping;

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

	public Cookie(int temperature, int calories, String flavor, int id) {
		super(temperature, calories, flavor, id);
		topping = new Topping("chocolate", "icing");
	}

	@Override
	public String toString() {
		return "Cookie [topping=" + topping + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
