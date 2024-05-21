package TrySoloCodes;

public class forLoopSolo {

	public static void main(String[] args) {
		
		for (int i = 10; i >= 0;i--)
		{
			System.out.println("The value of i is: " + i);
		}
			
		System.out.println();
		
		for (int a = 55; a >= 0; a--)
		{
			if (a % 7 == 0) {
				System.out.println("The value of a is: " + a );
			}
		}
		System.out.println();
		
		for (int i = 0; i <10; i ++)
		{
			if (i == 4)
			{
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++)
		{
			if (i == 4){
				continue;				
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i <= 10; i++)
		{
			if(i % 2 == 0)
				continue;
			System.out.print(i + " ");
		}
		
		
		
		

	}

}
