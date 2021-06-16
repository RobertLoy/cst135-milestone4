package edu.gcu.cst135.milestone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakery {

	List<BakedGood> bakedGoods = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void open() {
		bakedGoods.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
		bakedGoods.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
		bakedGoods.add(new Donut(325, 250, "chocolate", 102));
		bakedGoods.add(new Cookie(375, 175, "peanut butter", 103));

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
			System.out.println(" 5. Update a Baked Good (U)");	
			System.out.println(" 6. Delete a Baked Good (D)");	
			System.out.println(" 7. Exit");		
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
				updateBakedGood();
				break;
			case 6:
				deleteBakedGood();
				break;
			case 7:
				System.out.println("Thank you for visting our bakery");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter different option");
			}
		}while (true);

	}

	private void deleteBakedGood() {
		System.out.println("===========");
		System.out.println(" DELETE MENU ");
		System.out.println("===========");
		System.out.println("Deleting a baked good!");

	}

	private void updateBakedGood() {
		System.out.println("===========");
		System.out.println(" UPDATE MENU ");
		System.out.println("===========");
		System.out.println("Updating a baked good!");

	}

	private void addCookie() {
		System.out.println("===========");
		System.out.println(" CREATE MENU ");
		System.out.println("===========");
		System.out.println("Adding Cookie!");

	}

	private void addDonut() {
		System.out.println("===========");
		System.out.println(" CREATE MENU ");
		System.out.println("===========");
		System.out.println("Adding Donut!");

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
		System.out.println("===========");
		System.out.println(" READ MENU ");
		System.out.println("===========");

		for (BakedGood bg : bakedGoods) {
			System.out.println(bg.toString());
		}
	}

}
