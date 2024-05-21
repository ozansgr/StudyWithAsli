package TrySoloCodes;

import java.util.Scanner;

public class NestedLoopStarsScanner {

	public static void main(String[] args) {
		
		
		System.out.println("Hello! How many stars would you like to have?");
		Scanner scan = new Scanner(System.in);
		int stars = scan.nextInt();
		
		for (int i = 0; i <= stars; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = stars -1 ; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		

	}

}
