package TrySoloCodes;

import java.util.Scanner;

public class AllergyTask {

	public static void main(String[] args) {

		
		boolean yes = true;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have any allergies?");
		yes = scan.nextBoolean() == yes;
		
		if (yes == true)
		if (yes != true)
		if (false)
		{ System.out.println("You are healty"); }
	
		
		if (true) {
			System.out.println("What kind allergy?");
			boolean bee = true;
			boolean dairy = true;
			boolean peanut = true;
			boolean seafood = true;
			
			
			String [ ] beee = {"bees", "honey"};
			String [ ] daiyries = {"Milk" , "butter", "Yogurt"};
			String [ ] nuts = {"Hazelnut", "Peanut", "wallnuts", "etc"};
			String [ ] fishs = {"all  the fish that comes from sea"};
			
			if (true) {
			bee = scan.nextBoolean();
			dairy = scan.nextBoolean();
			peanut = scan.nextBoolean();
			seafood = scan.nextBoolean();
			 
			if (bee == true) {
			System.out.println("You are allergic to " + scan + " You should stay away from " + beee);}
			else if (dairy == true) {
				System.out.println("You are allergic to " + scan + ". You should stay away from " + daiyries);
			}
			else if (peanut = true) {
				System.out.println("You are allergic to " + scan + ". You should stay away from " + nuts);
			}
			else if (seafood == true){
				System.out.println("You are allergix to " + scan + ". You should stay away from " + fishs);
			}
			}
		}
		else {
			System.out.println("Why did you lied about your allergies!!!");
		}
		
		
		
		
	}

}
