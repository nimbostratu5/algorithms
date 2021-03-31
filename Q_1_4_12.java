import java.util.Arrays;
import java.util.Scanner;

public class Q_1_4_12 {

	public static void main(String[] args) {
		
		int[] array1 = new int[args.length];
		
		for ( int i = 0; i<args.length; i++)
		{	
			array1[i]=(Integer.parseInt(args[i].toString().replaceAll(",", "")));
		}
		
		//I'm aware this is a pretty convoluted way to get the 2nd array
		//I'll make sure to have something less messy than this for the upcoming asn's.
		Scanner line2 = new Scanner(System.in);
		System.out.print("enter 2nd array input: ");
		
		String s = line2.nextLine();
		s = s.replace(",", "");
		s = s.replace(" ","");

		int[] array2 = new int[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			array2[i]= Character.getNumericValue(s.charAt(i));
		}
				
		//For this problem, we can use MergeSort. 
		//Since the 2 arrays are sorted already, the time-complexity is O(N) because 
		//the partitioning part is done already, which are the sorted array1 and array2.
		//The action of merging is the sole function responsible for the O(N).
		
		//create the resulting array
		int[] merged = new int[array1.length+array2.length];
		int i=0, j=0, k=0;//arrays position and to know when an array emptied
		
		//we check the value from 0 to length N-1 for both arrays.
		//so while it might seem like we go through 2 arrays i.e. N^2, we're just comparing 
		//2 values every iteration and inserting the smallest in the merged array.
		//In other words, we never compare more than N times.
		while(i< array1.length && j<array2.length)
		{
			if(array1[i] < array2[j])
			{
				merged[k] = array1[i];
				i++;				
			}
			else
			{
				merged[k] = array2[j];
				j++;
			}
			k++;
		}
		
		//Once we are out of the loop, then we have a child array that has emptied
		//which means the other child array contains the remaining elements.
		//Since the values are already sorted, it's basically just copying over the 
		//to merged array elements
		
		while(i<array1.length)
		{
			merged[k] = array1[i];
			k++;
			i++;
		}
		
		while(j<array2.length)
		{
			merged[k] = array2[j];
			k++;
			j++;
		}
		
		//printing
		System.out.println("sorted result:");
	
		for(k =0; k< merged.length; k++)
		{
			System.out.print(merged[k]+" ");
		}
		
		
		
	}

}
