import java.util.Scanner;
import java.util.Arrays;

public class Q_1_4_14 {
	
	static int[] merged;

	public static void sort(int[] arr)
	{
		int[] a;
		int[] b;
		
		int mid = (arr.length-1)/2;
		
		a = new int[mid];
		b = new int[mid+mid];
		
		
    

        merge(a,b); 
	}
	
	public static void merge(int[] array1, int[] array2)
	{
		int size = array1.length+array2.length;
		merged = new int[size];
		int i=0, j=0, k =0;
		
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

	}
	
	
	public static void main(String[] args) {
	
		int[] array = new int[args.length];
		
		for ( int i = 0; i<args.length; i++)
		{	
			array[i]=(Integer.parseInt(args[i].toString().replaceAll(",", "")));
		}
		
		Scanner getsum = new Scanner(System.in);
		System.out.print("sum: ");
		int sum = getsum.nextInt();
		int sum2;
		//sort(array);
		Arrays.sort(array);
		
		for(int i =0; i< array.length;i++)
		{
			for(int j =i+1; j<array.length; j++)
			{
				sum2 = array[i] + array[j];
				if(sum ==sum2 )
				{
					System.out.println("true");
				}			
		}
		
		
		
		//for ( int i = 0; i<merged[i]; i++)
		//{	
		//	System.out.print(merged[i]+" ");
		//}
		}
	}

}
