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

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
