package edu.gcu.cst135.milestone;

public class Topping {
	
	private String flavor;
	private String type;
	
	public Topping(String flavor, String type) {
		super();
		this.flavor = flavor;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Topping [flavor=" + flavor + ", type=" + type + "]";
	}
	
	

}
