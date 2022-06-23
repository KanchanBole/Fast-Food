package Food;

import java.security.interfaces.RSAKey;
import java.util.Scanner;

public class FoodMenu {
    
	public double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering=true;
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void menu() {
	
	System.out.println("WELCOME To FastFood \n 1. Burger (Rs.165) \n 2. Fries (Rs.85) \n 3. Pizza (Rs.170) \n 4. Vegetable Roll (Rs.80) \n");
 	System.out.println("Please select a menu");

	}
	
	public static double itemPrice(int foodItem) {
		if (foodItem==1) {
			System.out.println("you've odered " + foodItem + " Burger");
			itemPrice=165;
		  }
		if (foodItem==2) {
			System.out.println("you've odered " + foodItem + " Fries");
			itemPrice=85;
           }
		
       if (foodItem==3) {
			System.out.println("you've odered " + foodItem + " Pizza");
			itemPrice=170;
			}
       if (foodItem==4) {
			System.out.println("you've odered " + foodItem + " Vegitable Roll");
			itemPrice=80;
			}
       System.out.println("\n");
          quantity();
		
		return itemPrice;
		
	}
	
	public static double quantity() {
		System.out.println("Enter Quantity" );
	     double quantity=scanner.nextDouble();
	    
	     subTotal(quantity,itemPrice);
		return quantity;
	     
	
	}

	private static double subTotal(double quantity, double itemPrice2 ) {
		// TODO Auto-generated method stub
		System.out.println( "quantity" + quantity + " price " + itemPrice);
		
		double subTotal=quantity*itemPrice;
		
		System.out.println("..............................");
		
		System.out.println("SubTotal " +subTotal);
		return subTotal;
	}
	
	public static void done(double runningTotal) {
		ordering=false;
		System.out.println(runningTotal);
		System.out.println("Enjoy your meal");
		
	}
	
	public static void main(String[] args) {
		int menuOption;
		int foodItem=0;
		scanner=new Scanner(System.in);
		do {
			
			double runningTotal=0;
			menu();
			menuOption=scanner.nextInt();
			switch (menuOption) {
			case 1:
				foodItem=1;
				itemPrice(foodItem);
				break;
				
			case 2:
				foodItem=2;
				itemPrice(foodItem);
				break;

			case 3:
				foodItem=3;
				itemPrice(foodItem);
				break;

			case 4:
				foodItem=4;
				itemPrice(foodItem);
				break;

			


			default:
				System.out.println("Invalid Option, Please select Menu...");
				break;
			}
		} while (ordering);
		{
			subTotal(quantity(), itemPrice(foodItem));
			runningTotal=runningTotal+subTotal(quantity(), itemPrice(foodItem));
		}
		
				
	}
	

}
