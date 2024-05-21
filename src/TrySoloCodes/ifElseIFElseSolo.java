package TrySoloCodes;

public class ifElseIFElseSolo {

	public static void main(String[] args) {

		
		int a = 6000;
		int b = 7000;
		int c = 10000;
		
		if(a > b) {
			System.out.println("A is the biggest number.");
		}
		else if (b > c) {
			System.out.println("B is the bigges number.");
		}
		else if (a > c) {
			System.out.println("A is bigger than C.");
		
		}
		else if ((c + b) < (a + b)) {
			System.out.println((c + b) + " is the bigger than " + (a+b));
		}
		else if ((b * 2) == (2*(c) - a)) {
			System.out.println((b*2) + " is equal to " + (2*(c)-a) + ".");
		}
		else {
			System.out.println("C is the biggest number.");
		}
		System.out.println("\n-----------------------");
		
		
		if (b < a) {
			if (b > c) {
				System.out.println("C is biggest number");
			}
			else {
				System.out.println("A is less than other numbers");
			}
		}
		else {
			System.out.println("A is the smallest number");
		}
		
		
		
		
		
		
	}

}
