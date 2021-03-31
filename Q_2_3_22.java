import java.util.Scanner;

public class Q_2_3_22 {

	
//**************************************************************************************//
// 								Noor Alali - 26797180
//**************************************************************************************//	
	
	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Enter a String separated by spaces");
		String string = input.nextLine();
		string = string.replaceAll(" ", "");
		char[] array = string.toCharArray();
	
		SortMergeLibrary.FastEntropySort(array);
		for(int i =0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
