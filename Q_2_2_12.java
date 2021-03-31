import java.util.Arrays;
import java.util.Scanner;

public class Q_2_2_12 {
	
//**************************************************************************************//
//								Noor Alali - 26797180
//**************************************************************************************//	

	public static void main(String[] args) {
				
		//In this exercise, it is assumed that M must be multiple of N
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size_of_array = input1.nextInt();
		
		System.out.println("Enter the size of the block");
		int M = input2.nextInt();
		
		int[] array = new int[size_of_array];
		
		//Random values are generated with a range from 0 to 20
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*20);
		}
		
		System.out.println("Original array: " + "\n" +Arrays.toString(array));
		
		// Function BlockSort will effectively divide the array in blocks of M.
		// Then, for each block, it will use selection sort to sort the block.
		SortMergeLibrary.BlockSort(array, M);
		// Uncomment the following 2 lines of code to print the array after dividing 
		// the original array into blocks and using selection sort to sort each block:
		// System.out.println("After dividing array into blocks and using selection sort to sort each block:");
		// System.out.println(Arrays.toString(array));
		
		// Then merge the blocks 
		for(int i=0;i<size_of_array/M;i++)
		{
			SortMergeLibrary.BlockMerge(array, M);
		}
		System.out.println("Sorted array:"+"\n"+Arrays.toString(array));

	}

}
