package TrySoloCodes;

public class NestedLoops {

	public static void main(String[] args) {
		
		
		for ( int i = 1; i <= 5; ++i)
		{
			System.out.println("Outher loop iteration " + i);
			for(int j = 1; j <= 2; ++j)
			{
				System.out.println("i = " + i + "; j + " + j);
			}
		}
		
	}

}
