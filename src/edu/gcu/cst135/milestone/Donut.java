package edu.gcu.cst135.milestone;

import java.io.Serializable;

public class Donut extends BakedGood  implements Serializable{

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

	public Filling getFilling() {
		return filling;
	}

	public void setFilling(Filling filling) {
		this.filling = filling;
	}

	@Override
	public String toString() {
		return "Donut [filling=" + filling + ", toString()=" + super.toString() + "]";
	}
	

}
