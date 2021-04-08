package SmartwatchScanner;
public class Main {

	public static void main(String[] args) {

		Smartwatch Fitbit= new Smartwatch();
		Smartwatch Garmin= new Smartwatch();
		Smartwatch Suunto= new Smartwatch();
		Smartwatch Guess= new Smartwatch();
	    
		System.out.println("\tWelcome to Smartwatch Shop");
		System.out.println("==================================");
		//Print Info of Smartwatch
		System.out.println("\tFitbit SPECIFICATION");
		Fitbit.printInfo("Versa 2", "Rose gold",395, 25,'N');
		Fitbit.printBluetooth();
		Fitbit.printMessaging();
		Fitbit.printDetect();	
		Fitbit.calPrice();

		System.out.println("\tGarmin SPECIFICATION");
		Garmin.printInfo("Vivosmart HR", "Midnight Blue", 559,30,'Y');					
		Garmin.printBluetooth();
		Garmin.printMessaging();
		Garmin.printDetect();	
		Garmin.calPrice();
		
		System.out.println("\tSuunto SPECIFICATION");
		Suunto.printInfo("Traverse", "White", 639,15,'Y');	
		Suunto.printBluetooth();
		Suunto.printMessaging();
		Suunto.printDetect();	
		Suunto.calPrice();
		
		System.out.println("\tGuess SPECIFICATION");
		Guess.printInfo("Rex Mens Digital+", "Grey", 699,12,'Y');	
		Guess.printBluetooth();
		Guess.printMessaging();
		Guess.printDetect();	
		Guess.calPrice();
		System.out.println("--Thank you and have a nice day--");
	}

}
