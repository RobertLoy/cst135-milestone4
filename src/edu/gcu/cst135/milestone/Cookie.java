package edu.gcu.cst135.milestone;

public class Cookie extends BakedGood {

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
