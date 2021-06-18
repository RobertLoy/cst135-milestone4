package edu.gcu.cst135.milestone;

public class Bread extends BakedGood {

	private String grain;
	private String style;
	
	
	
	public String getGrain() {
		return grain;
	}

	public void setGrain(String grain) {
		this.grain = grain;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Bread(int temperature, int calories, String flavor, int id) {
		super(temperature, calories, flavor, id);
		// TODO Auto-generated constructor stub
	}

	public Bread(int temperature, int calories, String flavor, int id, String grain, String style) {
		super(temperature, calories, flavor, id);
		this.grain = grain;
		this.style = style;
	}
	

	@Override
	public String toString() {
		return "Bread [grain=" + grain + ", style=" + style + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
