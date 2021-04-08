package SmartwatchScanner;

import java.util.Scanner; //import util package that including Scanner class

	public class Smartwatch {
		
			Scanner read = new Scanner(System.in);
			
			void printInfo(String m,String c, int p, int s, char y) { 
				
				System.out.println("Enter Brand: ");
				String b = read.next();
				System.out.println("Brand : " + b);
					
				System.out.println("Model : " + m);
				System.out.println("Color : " + c);
				System.out.println("Price : RM " + p);
				System.out.println("Number of store : " + s);
				System.out.println("Swim-proof(Yes/No): " + y);
				
				System.out.println("Enter Water Resistant (meter): ");
				int r = read.nextInt();
				int rToATM  = r / 10; //meter change to ATM (Calculation)
				System.out.println("Water Resistant   : " + rToATM + " ATM");
			}
			
			void printBluetooth() {
				System.out.println("Bluetooth (Y/N) : ");
				char b = read.next().charAt(0); 
				
				if (b == 'Y') {
				System.out.println("Bluetooth devices: ");
				String f = read.next()+ read.nextLine(); 
				System.out.println("Yes, it allows you to connect a variety of devices to it \nsuch as " + f);
				}					
			}
			
			void printMessaging() { //textApp 
				System.out.println("Messaging (Yes/No) : ");
				String n = read.next(); //Status of allowing message
				switch (n)
				   {
				   case "Yes": 
						System.out.println(n+ ". It text through FB Messenger,Line and so on.");
				    	break;
				    case "No" :
					    System.out.println(n + ". It just receive message notification and incoming email only.");
				    	break;		
				   }
			}
			
			void printDetect() {
				System.out.println("Detect: ");
				String d = read.next()+ read.nextLine(); //detect function
				
				System.out.println("Function   : It can detect "+ d);
			}		
			
			void calPrice() { //Done 2 input
				System.out.println();				
				System.out.println("Enter Price and Quantity");
				int p = read.nextInt(); //price per unit
				int q = read.nextInt(); //quantity 	
				
				//------------Calculation--------------
				int discount = (p * 90)/100; 
				int tP = discount * q; //Total Price = pricePerUnitAfterDiscounted * Quantity 
				System.out.println("After get discount 10%:");		
				System.out.println("Price per unit: RM " + p);			
				System.out.println("Price per unit after discounted: RM " + discount);		
				System.out.println("Quantity      : " + q);		
				System.out.println("Total Price   : RM "+ tP);	
				System.out.println("----------------------------------");				
			}

}
