import java.util.Arrays;
import java.util.Scanner;

public class Q_2_2_20 {

//**************************************************************************************//
//								Noor Alali - 26797180
//**************************************************************************************//	
	
	
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int N = input1.nextInt();
		
		int[] array = new int[N];
		
		//Random values are generated with a range from 0 to 20
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*20);
		}
		
		System.out.println("Original array:" +"\n" + Arrays.toString(array));
		
		//IndirectSort will not re-arrange the array. 
		//IndirectSort outputs an array of index where i = index pointing to the smallest element in the array
		//IndirectSort uses a modified version of Bottom-Up MergeSort
		SortMergeLibrary.IndirectSort(array);
		System.out.println("Perm:" +"\n" + Arrays.toString(SortMergeLibrary.IndirectSort(array)));
		
	}

}
