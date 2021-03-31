import java.util.Arrays;
import java.util.Scanner;

public class Q_2_4_29 {
	
//**************************************************************************************//
//								Noor Alali - 26797180
//**************************************************************************************//	

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the size of the heap");
		int N = input1.nextInt();
		
		int[] array = new int[N];
		HeapPriorityQueue HPQ = new HeapPriorityQueue(N);
		//Random values are generated with a range from 0 to 20
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*10);
			HPQ.insert(array[i]);
		}
		System.out.println("Original heap:" +"\n" + Arrays.toString(array));
		
		System.out.println("Count of items in heap: "+HPQ.get_size());
		
		System.out.println("Max item in heap: "+HPQ.findmax());
		System.out.println("Min item in heap: "+HPQ.findmin());
		
		int n = HPQ.get_size()/2;
		
		System.out.println("Delete items from heap in natural order ");
		for(int i =0;i<n;i++)
		{
			System.out.print(HPQ.delMin());
			System.out.print(" ");
		}
		
		System.out.println("\n"+"Delete items from heap in reverse order ");
		for(int i =0;i<n;i++)
		{
			System.out.print(HPQ.delMax());
			System.out.print(" ");
		}
	}

}
