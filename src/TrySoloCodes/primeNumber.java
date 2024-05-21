package TrySoloCodes;

public class primeNumber {

	public static void main(String[] args) {

		int num = 17;
		boolean isPrime = true;
		
		if(num > 1) {
			if(num == 2)
				isPrime = true;
			else {
				int i = 2;
				while(i < num) {
					if(num % i == 0) {
						isPrime = false;
						break;
					}
					i++;
				}
			}
		}
		
		//else
		//	isPrime =false;
		
		if(isPrime)
			System.out.println("Given number is a Prime Number");
		else
			System.out.println("Given number is NOT a Prime Number");
		
		
		
		
		
	}

}
