package edu.gcu.cst135.milestone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakery {

	List<BakedGood> bakedGoods = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {
		
//		bakedGoods.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
//		bakedGoods.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
//		bakedGoods.add(new Donut(325, 250, "chocolate", 102));
//		bakedGoods.add(new Cookie(375, 175, "peanut butter", 103));

		bakedGoods = DataService.read();
		menu();

	}

	public void menu() {
		do {
			System.out.println("===========");
			System.out.println(" MAIN MENU ");
			System.out.println("===========");
			System.out.println(" 1. Add a Bread (C)");	
			System.out.println(" 2. Add a Donut (C)");		
			System.out.println(" 3. Add a Cookie (C)");		
			System.out.println(" 4. List all Baked Goods (R)");	
			System.out.println(" 5. List details of a Baked Good (R)");	
			System.out.println(" 6. Update a Baked Good (U)");	
			System.out.println(" 7. Delete a Baked Good (D)");	
			System.out.println(" 8. Search for a Baked Good by Flavor (R)");	
			System.out.println(" 9. Sort Baked Goods by Calories(R)");	
			System.out.println(" 0. Exit");		
			System.out.println("===========");
			System.out.println("What options to perform? ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				addBread();
				break;
			case 2:
				addDonut();
				break;
			case 3:
				addCookie();
				break;
			case 4:
				viewAllBakedGoods(); 
				break;
			case 5:
				detailsBakedGood();
				break;	
			case 6:
				updateBakedGood();
				break;
			case 7:
				deleteBakedGood();
				break;
			case 8:
				searchBakedGood();
				break;
			case 9:
				sortBakedGood();
				break;	
			case 0:
				System.out.println("Thank you for visting our bakery");
				DataService.write(bakedGoods);
				System.exit(0);
				break;
			default:
				System.out.println("Please enter different option");
			}
		}while (true);

	}

	private void detailsBakedGood() {
		System.out.println("===========");
		System.out.println(" LIST DETAILS ");
		System.out.println("===========");
		viewAllBakedGoods(); 
		System.out.println("What item to see details? ");
		int item = sc.nextInt();
		sc.nextLine();
		System.out.println("FLAVOR: \t" + bakedGoods.get(item - 1).getFlavor());
		System.out.println("CALORIES: \t" + bakedGoods.get(item - 1).getCalories());
		System.out.println("TEMPERATURE: \t" + bakedGoods.get(item - 1).getTemperature());
		System.out.println("ID: \t" + bakedGoods.get(item - 1).getId());
		if (bakedGoods.get(item - 1) instanceof Bread) {
			System.out.println("GRAIN: \t" + ((Bread)bakedGoods.get(item - 1)).getGrain());
			System.out.println("STYLE: \t" + ((Bread)bakedGoods.get(item - 1)).getStyle());
		}
		else if (bakedGoods.get(item - 1) instanceof Donut) {
			System.out.println("FILLING");
			System.out.println("TYPE: \t" + ((Donut)bakedGoods.get(item - 1)).getFilling().getType());
			System.out.println("FLAVOR: \t" + ((Donut)bakedGoods.get(item - 1)).getFilling().getFlavor());
		}
		else if (bakedGoods.get(item - 1) instanceof Cookie) {
			System.out.println("TOPPING: \t" + ((Cookie)bakedGoods.get(item - 1)).getTopping());
		}
		
	}

	private void sortBakedGood() {
		System.out.println("===========");
		System.out.println(" SORT LIST ");
		System.out.println("===========");
		ComparatorCalories cc = new ComparatorCalories();
		bakedGoods.sort(cc);
		viewAllBakedGoods(); 
		
	}

	private void searchBakedGood() {
		System.out.println("===========");
		System.out.println(" SEARCH LIST ");
		System.out.println("===========");
		System.out.println("What do you want to search for? ");
		String search = sc.nextLine();
		
		int counter = 1;
		
		for (BakedGood bg : bakedGoods) {
			if (bg.getFlavor().toUpperCase().contains(search.toUpperCase()))
				System.out.println(counter++ + ". " + bg.toString());
		}
		
	}

	private void deleteBakedGood() {
		System.out.println("===========");
		System.out.println(" DELETE MENU ");
		System.out.println("===========");
		viewAllBakedGoods();
		System.out.println("===========");
		System.out.println("What item to delete? ");
		int item = sc.nextInt();
		sc.nextLine();
		bakedGoods.remove(item - 1);

	}

	private void updateBakedGood() {
		System.out.println("===========");
		System.out.println(" UPDATE MENU ");
		System.out.println("===========");
		viewAllBakedGoods();
		System.out.println("===========");
		System.out.println("What item to update? ");
		int item = sc.nextInt();
		sc.nextLine();
		
		if (bakedGoods.get(item) instanceof Bread) {
			updateBread(item);
		}
		else if (bakedGoods.get(item) instanceof Donut) {
			System.out.println("Updating a Donut");
			//updateDonut(item);
		}
		else if (bakedGoods.get(item) instanceof Cookie) {
			System.out.println("Updating a Cookie");
			//updateDonut(item);
		}
		else {
			System.out.println("I do not recognize that baked good");
		}
		updateBread(item);

	}

	private void addCookie() {
		System.out.println("===========");
		System.out.println(" CREATE MENU ");
		System.out.println("===========");
		System.out.println("Adding Cookie!");

	}
	
	private void updateBread(int item) {
		System.out.println("===========");
		System.out.println(" UPDATE MENU ");
		System.out.println("===========");
		//public Bread(int temperature, int calories, String flavor, int id, String grain, String style)
		
		System.out.println("What temperature to bake at? [ " + bakedGoods.get(item - 1).getTemperature() + "]");
		int temp = sc.nextInt();
		sc.nextLine();
		bakedGoods.get(item - 1).setTemperature(temp);
		
		System.out.println("How many calories? [ " + bakedGoods.get(item - 1).getCalories() + "]");
		int calories = sc.nextInt();
		sc.nextLine();
		bakedGoods.get(item - 1).setCalories(calories);
		
		System.out.println("What flavor? [ " + bakedGoods.get(item - 1).getFlavor() + "]");
		String flavor = sc.nextLine();
		bakedGoods.get(item - 1).setFlavor(flavor);
		
		System.out.println("What id number? [ " + bakedGoods.get(item - 1).getCalories() + "]");
		int id = sc.nextInt();
		sc.nextLine();
		bakedGoods.get(item - 1).setId(id);

		System.out.println("What grain? [ " + ((Bread)bakedGoods.get(item - 1)).getGrain() + "]");
		String grain = sc.nextLine();
		((Bread)bakedGoods.get(item - 1)).setGrain(grain);
		
		System.out.println("What style? [ " + ((Bread)bakedGoods.get(item - 1)).getStyle() + "]");
		String style = sc.nextLine();
		((Bread)bakedGoods.get(item - 1)).setStyle(style);
		
	}

	private void addDonut() {
		System.out.println("===========");
		System.out.println(" CREATE MENU ");
		System.out.println("===========");

		System.out.println("What temperature to bake at? ");
		int temp = sc.nextInt();
		sc.nextLine();
		
		System.out.println("How many calories? ");
		int calories = sc.nextInt();
		sc.nextLine();		
		
		System.out.println("What flavor? ");
		String flavor = sc.nextLine();
		
		System.out.println("What id number? ");
		int id = sc.nextInt();
		sc.nextLine();	

		System.out.println("Do you want to add a filling? [Yes, No]");	 //yes
		String needFilling = sc.nextLine().toUpperCase();
		if (needFilling.equals("YES") || needFilling.equals("Y") ) {
			
			System.out.println("What flavor? ");
			String flav = sc.nextLine();
			
			System.out.println("What type? ");
			String type = sc.nextLine();
			
			Filling filling = new Filling(flav, type);
			
			bakedGoods.add(new Donut(temp, calories, flavor, id, filling));
		}
		else {
			bakedGoods.add(new Donut(temp, calories, flavor, id));
		}	
	}

	private void addBread() {
		System.out.println("===========");
		System.out.println(" CREATE MENU ");
		System.out.println("===========");
		//public Bread(int temperature, int calories, String flavor, int id, String grain, String style)
		
		System.out.println("What temperature to bake at? ");
		int temp = sc.nextInt();
		sc.nextLine();
		
		System.out.println("How many calories? ");
		int calories = sc.nextInt();
		sc.nextLine();		
		
		System.out.println("What flavor? ");
		String flavor = sc.nextLine();
		
		System.out.println("What id number? ");
		int id = sc.nextInt();
		sc.nextLine();	

		System.out.println("What grain? ");
		String grain = sc.nextLine();
		
		System.out.println("What style? ");
		String style = sc.nextLine();
		
		bakedGoods.add(new Bread(temp, calories, flavor, id, grain, style));
	}

	public void viewAllBakedGoods() {
//		System.out.println("===========");
//		System.out.println(" READ MENU ");
//		System.out.println("===========");

		int counter = 1;
		
		for (BakedGood bg : bakedGoods) {
			System.out.println(counter++ + ". " + bg.toString());
		}
	}

}
