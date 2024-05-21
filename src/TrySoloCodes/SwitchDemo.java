package TrySoloCodes;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		Scanner index = new Scanner(System.in);
		System.out.println("Please enter a computer brand!!!");
		String brand = index.next();
		
		switch (brand) {
		case "apple":
			System.out.println("The brand of this computer is " + brand);
			break;
		case "acer":
			System.out.println("The brand of this computer is " + brand);
			break;
		case "dell":
			System.out.println("The brand of this computer is " + brand);
			break;
		default:
			System.out.println("I dont know this brand");
		
			
		}
		
		
		
		
		
	}

}
