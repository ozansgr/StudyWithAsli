package TrySoloCodes;

import java.util.Scanner;

public class SoloScanner2 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter a number");
		int num = input.nextInt();
		System.out.println("enter a second number");
		int num2 = input.nextInt();
		System.out.println("enter a third number");
		int num3 = input.nextInt();
		
		
		
		if ((num + num2 + num3) % 2 != 1) {
			System.out.println("the total number is even");
		}
		else {
			System.out.println("total number is odd");
		}
		
		
		
		
		
		
		
		
		
	}

}
