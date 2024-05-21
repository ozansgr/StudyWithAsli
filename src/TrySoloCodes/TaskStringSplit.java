package TrySoloCodes;

public class TaskStringSplit {

	public static void main(String[] args) {
		
		//Today is Tuesday and we are learning JAVA!
		//yadoT si yadseuT dna ew era gninrael AVAJ!
		
		String sentence = "yadoT si yadseuT dna ew era gninrael AVAJ!";
		
		String [] result =sentence.split(" ");
		
		for (String word : result)
		{
			System.out.print(word + " ");	
		}
		
		

	

	}
}