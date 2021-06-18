package edu.gcu.cst135.milestone;

public class Donut extends BakedGood{

	private Filling filling;

	public Donut(int temperature, int calories, String flavor, int id) {
		super(temperature, calories, flavor, id);
		filling = new Filling("strawberry","jelly");
		// TODO Auto-generated constructor stub
	}
	
	public Donut(int temperature, int calories, String flavor, int id, Filling filling) {
		super(temperature, calories, flavor, id);
		this.filling =  filling;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Donut [filling=" + filling + ", toString()=" + super.toString() + "]";
	}
	

}
