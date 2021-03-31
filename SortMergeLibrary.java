import java.util.Arrays;

//**************************************************************************************//
//				 				Noor Alali - 26797180
//**************************************************************************************//	

public class SortMergeLibrary {

//**************************************************************************************//
						//Q_2_2_12
//**************************************************************************************//	

	public static void BlockSort(int[] a, int M)
	{
		for(int i =0; i < a.length-M+1; i+=M)
		{
			RangedSSort(a,i,i+M-1);
		}
		//System.out.println(Arrays.toString(a));
	}
	
	//Modified selection sort method to take 2 extra arguments: start + end.
	//For Q_2_2_12: start and end are used to delimit each block within the array.
	private static void RangedSSort(int[] a, int start, int end)
	{	  
        for (int i = start; i < end; i++) 
        { 
            int min = i; 
            for (int j = i+1; j <= end; j++) 
            {
                if (a[j] < a[min]) 
                    min = j; 
            }
            int temp = a[min]; 
            a[min] = a[i]; 
            a[i] = temp; 
        } 
	}
	
	//For Q_2_2_12: function merging blocks together
	public static void BlockMerge(int[] a, int M)
	{
		int mid = M;
		int first = 0;
		int last = (M*2) -1;
		
		for(int j = 0; j < (a.length/M) -1; j++)
		{
			ReducedMerge(a, first, mid , last);
			first = first + M;
			mid = mid+M;
			last = last+M;
		}	
	}
	
	//For Q_2_2_12: function describing the BlockMerge process
	private static void ReducedMerge(int[] a, int l, int m, int r)
	{
		//System.out.println("L M R => " + l+ ","+m+","+r);
		
        int[] aux = new int[r-m+1];//same size as 1 block
        
        //System.out.println("aux length: "+aux.length);
        
        for(int i=l;i<m;i++)
        {
        	aux[i-l] = a[i]; 
        }
        int i=0,j =m;
        int k = l;
        
        //System.out.println("AUX:" + Arrays.toString(aux));
        
        while(i<aux.length && j<r+1)
        {
        	if(aux[i]<=a[j])
        	{
        		a[k] = aux[i];
        		i++;
        	}
        	
        	else
        	{
        		a[k] = a[j];
        		j++;
        	}
        	
        	k++;
        }  
        
       while(i<aux.length)
       {
    	   a[k] = aux[i];
    	   k++;
    	   i++;
       }
               
       //System.out.println(Arrays.toString(a));
	}

//**************************************************************************************//
						//Q_2_2_20
//**************************************************************************************//	
	
	static int[] perm;
	static int[] perm_copy;
	//IndirectSort calls the same sort function found in a typical MergeSort function.
	//However, it calls a different merge function.
	
	public static int[] IndirectSort(int[] a)
	{		
		sort2(a);
		return perm;
	}	
	
	//modified sort function of a Bottom-Up type MergeSort
	private static void sort2(int[] a)
	{
		perm = new int[a.length];
		perm_copy = new int[a.length];
		
		for(int i =0;i<a.length;i++)
		{
			perm[i] = i;
			perm_copy[i]= i;
		}
		
		for (int sz = 1; sz < a.length; sz = sz+sz)
		{
			for (int lo = 0; lo < a.length-sz; lo += sz+sz)
			{
				IndirectMerge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, a.length -1));
			}
			perm_copy = perm.clone();
		}
	}
	
	//modified merge function of a Bottom-Up type MergeSort to deal with indices 
	//the idea here is to have an array acting as a look-up table to the input array
	//perm_copy[] serves as the look-up table for perm[]
	private static void IndirectMerge(int[] a, int lo, int mid, int hi)
	{			
		//System.out.println(lo+","+mid+","+hi+" PermCopy:"  + Arrays.toString(perm_copy));		
		int i = lo; 
		int j = mid+1;
		
		for (int k = lo; k <= hi; k++) 
		{
			if (i > mid)
			{
				perm[k] = perm_copy[j++];
			}			
			else if (j > hi ) 
			{
				perm[k] = perm_copy[i++];
			}
			else if (a[perm_copy[i]]<=a[perm_copy[j]])
			{
				perm[k] = perm_copy[i++];
				}
			else 
			{
				perm[k] = perm_copy[j++];
			}
		//System.out.println("Perm:" + Arrays.toString(perm)+"     " +i+","+j + "           copy:" + Arrays.toString(perm_copy));
		}	
	}
	
	
//**************************************************************************************//
						//Q_2_3_12
//**************************************************************************************//	
	
	
	public static void EntropySort(char[] a)
	{
		//Std.Random.shuffle(a);
		//The implementation of the above function is a found in Sedgwick's java files.
		//Randomizing an array such as the one given in 2.3.12 is a moot process
		//because elements are heavily repeated here.
		//Thus, for simplicity sake (and minimizing run time), this step is omitted.
		
		System.out.print(0+"  "+0+"  "+(a.length-1)+"  ");
		for(int o =0;o<a.length;o++)
		{
			System.out.print(a[o]+" ");
		} 
		System.out.println();
		
		q3way(a,0,a.length-1);
	}
			
	private static void qsort(char[] a, int lo, int hi) 
	{
		if(hi<=lo) return;
		int j = partition(a, lo, hi);
		q3way(a, lo, j-1);
		q3way(a, j+1, hi);
	}
	
	private static int partition(char[] a, int lo, int hi)
	{
		int i = lo, j = hi+1;
		char v = a[lo];
		char temp;
		while(true)
		{
			while(a[++i]< v)
			{
				if(i == hi)
					break;
			}
			while(a[--j] > v)
			{
				if(j == lo)
					break;
			}
			
			if(i>=j)
			{
				break;
			}
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		temp = a[lo];
		a[lo] = a[j];
		a[j] = temp;

		return j;
	}

	private static void q3way(char[] a, int lo, int hi)
	{
		
		if(hi <= lo) 
		{
			return;
		}
		
		int lt = lo, i = lo+1, gt = hi;				
		char v = a[lo];
		char temp;
				
		while (i <= gt)
		{		
			
			System.out.print(lt+"  "+i+"  "+gt+"  ");
			for(int o =0;o<a.length;o++)
			{
				System.out.print(a[o]+" ");
			} 
			System.out.println();
			
			if (a[i] < v) 
			{
				temp = a[lt];
				a[lt] = a[i];
				a[i] = temp;
				i++;lt++;
			}
			else if (a[i] > v)
			{
				temp = a[i];
				a[i] = a[gt];
				a[gt] = temp;
				gt--;
			}
			else 
			{
				i++;
				if(i>=gt)
				{
					System.out.print(lt+"  "+i+"  "+gt+"  ");
					for(int o =0;o<a.length;o++)
					{
						System.out.print(a[o]+" ");
					} 
					System.out.println();
					return;
				}
			}
			
		}
		qsort(a, lo, lt - 1);
		qsort(a, gt + 1, hi);
	}
	
	
//**************************************************************************************//
						//Q_2_3_22
//**************************************************************************************//	
	
	public static void FastEntropySort(char[] a)
	{
		//Std.Random.shuffle(a);
		//The implementation of the above function is a found in Sedgwick's java files.
		//I wanted to implement my own random shuffle function but it became messy..
		//Out of frustration, I decided to drop it. 
			
		fastq3way(a,0,a.length-1);
	}
	
	private static void fq3sort(char[] a, int lo, int hi) 
	{
		if(hi<=lo) return;
		int j = partition(a, lo, hi);
		fastq3way(a, lo, j-1);
		fastq3way(a, j+1, hi);
	}
	
	private static void fastq3way(char[] a, int lo, int hi)
	{
		
		if(hi <= lo) 
		{
			return;
		}
		
		int i = lo, j=hi+1; 
		int p = i, q=j;	
		// v is the pivot
		char v = a[lo];
		char temp;
				
		while (true)
		{				
			if (i> lo && a[i] == v) 
			{
				temp = a[p];
				a[p] = a[i];
				a[i] = temp;
				++p;
			}
			if (j <= hi && a[j] == v)
			{
				temp = a[q];
				a[q] = a[j];
				a[j] = temp;
				--q;
			}
			
			//System.out.println(a[i]+","+a[i+1]);
			while(a[++i] < v)
			{
				if (i==hi)
				{
					break;
				}
			}
			//System.out.println(a[j]+","+a[j-1]);
			while(a[--j] > v)
			{
				if (j==lo)
				{
					break;
				}
			}
			
			//this is a special case when i and j cross.
			//if i==j and the element happens to be =V, 
			//the program would miss the key and ends up being misplaced.
			//we can send that value either direction, it doesn't matter.
			if(i == j && a[i] == v)
			{
				temp = a[q];
				a[q] = a[j];
				a[i] = temp;
				q--;
			}
						
			//usual comparison with a[i] and a[j]
			if(i <= j)
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			else break;

		}
		//System.out.println(i+","+j);
		i = j+1;
		char temp2;
		//System.out.println(i+","+j);
		
		//Left-hand-side =V keys are put in the middle
		//from position lo to p
        for(int o = lo; o <= p; o++)
        {
        	//System.out.println(o);
            temp2 = a[o];
            a[o] = a[j];
            a[j] = temp2;
            j--;
            //System.out.println(o);
        }
        
        //Right-hand-side =V keys are put in the middle
      	//from position q to hi
        for(int o = q; o <= hi; o++)
        {
        	//System.out.println(o);
        	temp2 = a[o];
            a[o] = a[i];
            a[i] = temp2;
            i++;
            //System.out.println(o);
        }
        
		fq3sort(a, lo, j);
		fq3sort(a, i, hi);	
	}
	
	
//**************************************************************************************//
						//Q_2_4_29
//**************************************************************************************//	
	
	//I had trouble implementing the Comparable interface in here, wasted lots of time.
	//As a compromise, see HeapPriorityQueue class.

}
