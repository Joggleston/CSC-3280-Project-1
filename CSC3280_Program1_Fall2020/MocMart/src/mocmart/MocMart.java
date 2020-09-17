package mocmart;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class MocMart {
	public static void addItem(String[] x, MocMartProduct[] items) {
		int current = MocMartProduct.getNumProducts();
		items[current] = new MocMartProduct();
		items[current].setItemNum(Integer.parseInt(x[1]));
		items[current].setItemName(x[2]);
		items[current].setItemPrice(Integer.parseInt(x[3]));
		items[current].setQuantity(Integer.parseInt(x[4]));
		items[current].setRestockQuantity(Integer.parseInt(x[5]));
	}
	public static void findItem(int x, MocMartProduct[] items, PrintWriter out) {
		boolean flag = false;
		int half = MocMartProduct.getNumProducts()/2;
		
		//if the array of objects is empty
		
		//if the array contains but 1 object
		
		//if there's more than 1 object in array
		for (int i = 0; i < MocMartProduct.getNumProducts(); i++) {
			out.print(half); //print midpoint every iteration
			if (x ==  items[half].getItemNum()) {
				//print required info
				flag = true;
				break;
			}
			else if (x > items[half].getItemNum()) {
				half += half/2;
			}
			else {
				half -= half/2;
			}
		}
		
		if (!flag) {
			//object doesn't exist
		}
		
	}
	public static void restock(MocMartProduct[] items) {
		//if array contains no objects
		
		//if 1 or more objects are in array
		for (int i = 0; i < MocMartProduct.getNumProducts(); i++) {
			if (items[i].getQuantity() == 0) {
				items[i].setQuantity(items[i].getRestockQuantity());
			}
		}
	}
	public static void customer(String[] x, MocMartSale[] sale) {
		int curr = MocMartSale.getNumSales();
		sale[curr].setFirstName(x[1]);
		sale[curr].setLastName(x[2]);
		sale[curr].setNumItemsOnList(Integer.parseInt(x[3]));
		
		for (int i = 0; i < Integer.parseInt(x[3]); i++) {
			sale[curr].setItemsPurchased();
		}
		sale[MocMartSale.getNumSales()].setItemsPurchased(Integer.parseInt(x[4-9]));
		
		
	}
	public static void main(String[] args) throws Exception{
		String command;
		
		File inputFile = new File("MocMart.in");
		if (!inputFile.exists()) {
			System.out.println("Input file, " + inputFile + ", does not exist.\n");
			System.exit(0);
		}
		File outputFile = new File("MocMart.out");
		
		Scanner in = new Scanner(inputFile);
		PrintWriter output = new PrintWriter(outputFile);
		
		int maxProducts = in.nextInt();
		int maxSales = in.nextInt();
		
		MocMartProduct[] products  = new MocMartProduct[maxProducts];
		MocMartSale[] sales = new MocMartSale[maxSales];
		
		do {
			command = in.nextLine();
			String[] x = command.split(" ");
			
			switch (x[0]) {
				case "ADDITEM":
					addItem(x, products);
					break;
				case "FINDITEM":
					findItem(Integer.parseInt(x[1]), products, output);
					break;
				case "RESTOCK":
					break;
				case "CUSTOMER":
					break;
				case "INVENTORY":
					break;
				case "PRINTSUMMARY":
					break;
				case "QUIT":
					//boolean as continue check
					break;
			}
			
		} while (true); // boolean as continue check
	}
}