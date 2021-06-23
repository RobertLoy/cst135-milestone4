package edu.gcu.cst135.milestone;

import java.util.Comparator;

public class ComparatorCalories implements Comparator<BakedGood> {

	@Override
	public int compare(BakedGood o1, BakedGood o2) {
		// STRING COMPARE: 	return o1.getName().compareTo(o2.getName());
		return ((Integer)o1.getCalories()).compareTo(o2.getCalories());
	}

}
