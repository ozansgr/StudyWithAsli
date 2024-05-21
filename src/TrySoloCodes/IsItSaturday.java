package TrySoloCodes;

public class IsItSaturday {

	public static void main(String[] args) {

		// Is it saturday? is it raining? do we have a Java Class today?
		
		String sentence = "Is it saturday? is it raining? do we have a Java Class today?";
		
		String [] result =sentence.split("\\?");
		
		for (String word : result)
		{
			System.out.println(word);
		}
		
		System.out.print("The sentence has " + result.length + " words!");
		
		System.out.println("\n--------------");
		
		
		String str = "Is it saturday? is it raining? do we have a Java Class today?";
		
		for (int i = 0; i < str.length()-1; i--)
		{
			System.out.println("The length of the sentence is " + str.length());
			break;
		}
	
		
		
		//Escape Characters:
		//  \n, \t, \? --> these combinations have a special meaning to Java
		// so we can use \\? , or [?]
		
		
		
		
		
		
		
		
		
		
	}

}
