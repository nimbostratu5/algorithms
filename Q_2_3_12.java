import java.util.Arrays;

public class Q_2_3_12 {

	
//**************************************************************************************//
//								Noor Alali - 26797180
//**************************************************************************************//	
	public static void main(String[] args) {
	
		//The test case result in the pdf is has an extra "B A"
		//Using the book's example, the string is from 0 -> 14
		
		String string = "B A B A B A B A C A D A B R A";
		//String string = "R B W W R W B R R W B R";
		
		string = string.replaceAll(" ", "");
		char[] array = string.toCharArray();
		
		System.out.print("lt "+"i  "+"gt  ");
		for(int i =0;i<array.length;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int i =0;i<1.5*array.length;i++)
		{
			System.out.print("- ");
		}
		System.out.println();
		
		SortMergeLibrary.EntropySort(array);
		//System.out.println(array);
	}

}
