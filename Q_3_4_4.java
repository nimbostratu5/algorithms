import java.util.Scanner;

public class Q_3_4_4 {

	public static void main(String[] args) {

//		M will depend on the input size i.e. # of distinct letters
//		Hash function = (a*k)%M
//		Goal: hash function must produce distinct values for input keys
//		Concept studied => modular hashing
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Keys separated by spaces:");
		String keys = input.nextLine();
		keys = keys.replaceAll(" ", "");
//		Java will output a unicode integer when casting a char to int
//		A = 65 ... Z = 90
//		A = (65-64) = 1 ... Z = (90-64) = 26
		
//		Since M must be smallest, the loop with iterating 'M' first and then 'a'
		for(int M = 2; M<=29; M++)
		{
			for(int a = 1; a<841;a++)
			{
				int[] hashset = new int[keys.length()];
				
				for(int i = 0; i< keys.length();i++)
				{
					int hashcode = (a*(keys.charAt(i)-64))%M;
					hashset[i] = hashcode;
				}
				
//				function that checks if presence of collision i.e. repeated hashcodes
				if(SortMergeLibrary.distinctcheck(hashset) == true)
				{
					System.out.println("a = " + a + "  M = "+M);
					return;
				}
				
			}
		}
		
	}

}
