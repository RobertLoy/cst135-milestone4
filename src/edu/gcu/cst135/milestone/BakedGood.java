package edu.gcu.cst135.milestone;

public class BakedGood {
	
	private int temperature;
	private int calories;
	private String flavor;
	private int id;
	
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BakedGood(int temperature, int calories, String flavor, int id) {
		super();
		this.temperature = temperature;
		this.calories = calories;
		this.flavor = flavor;
		this.id = id;
	}

	public void bake() {
		System.out.println("baking..");
	}

	@Override
	public String toString() {
		return "BakedGood [temperature=" + temperature + ", calories=" + calories + ", flavor=" + flavor + ", id=" + id
				+ "]";
	}
	
	

}
