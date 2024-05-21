package TrySoloCodes;

import java.util.Scanner;

public class SoloScanner {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name=input.next();
		System.out.println("Please enter your lastname");
		String lastname=input.next();
		System.out.println("Please enter your age");
		int age=input.nextInt();
		System.out.println("Your name is " + name + " and your lastname is " + lastname + " and you are " + age + " years old.");
		
		
		System.out.println("\n-------------\n");
		
		
		
		System.out.println("Please enter your quiz resut");
		int quiz=input.nextInt();
		System.out.println("Please enter your midterm result");
		int midterm=input.nextInt();
		System.out.println("Please enter your final exam result");
		int finalexam=input.nextInt();
		
		if(((quiz + midterm + finalexam) / 3) >= 90) {
			System.out.println("Your grade is A");
		}
		else if (((quiz + midterm + finalexam) / 3) >= 70 && ((quiz + midterm + finalexam) / 3) < 90) {
			System.out.println("Your grade is B");
		}
		else {
			System.out.println("Your grade is C");
		}
		

	}

}
