package edu.gcu.cst135.milestone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataService {
	
	public static List<BakedGood> read(){
		
		List<BakedGood> items = new ArrayList<>();
		
//		items.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
//		items.add(new Bread(325, 4000, "white", 100, "wheat", "loaf"));
//		items.add(new Donut(325, 250, "chocolate", 102));
//		items.add(new Cookie(375, 175, "peanut butter", 103));
		
		try {
			FileInputStream fis = new FileInputStream("desserts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			items =(ArrayList<BakedGood>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return items;
		
	}

	public static void write(List<BakedGood> items) {
		
		try {
			FileOutputStream fos = new FileOutputStream("desserts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(items);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
