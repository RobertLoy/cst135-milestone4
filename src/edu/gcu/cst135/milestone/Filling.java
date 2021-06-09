package edu.gcu.cst135.milestone;

public class Filling {
	
	private String flavor;
	private String type;
	
	public Filling(String flavor, String type) {
		super();
		this.flavor = flavor;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Filling [flavor=" + flavor + ", type=" + type + "]";
	}

	
	
}
