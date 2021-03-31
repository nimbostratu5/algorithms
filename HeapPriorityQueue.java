
public class HeapPriorityQueue{
	
	private int[] pq; //heap 1
	private int[] pq2;//heap 2
	
	private int N = 0;
	private int N2 = 0;
	
	public HeapPriorityQueue(int maxN)
	{ 
		pq = (int[]) new int[maxN+1]; 
		pq2 = (int[]) new int[maxN+1]; 
	}
	
	public void insert(int v)
	{
		pq[++N] = v;
		swim(N);
		
		pq2[++N2] = v;
		swim2(N2);
	}
	
	private void swim(int n)
	{
		int temp;
		while(n>1 && pq[n/2]<pq[n])
		{
			temp = pq[n/2];
			pq[n/2] = pq[n];
			pq[n] = temp;
			n = n/2;
		}
	}
	
	private void swim2(int n)
	{
		int temp;
		while(n>1 && pq2[n/2]>pq2[n])
		{
			temp = pq2[n/2];
			pq2[n/2] = pq2[n];
			pq2[n] = temp;
			n = n/2;
		}
	}
	
	private void sink(int n)
	{
		int temp;
		while (2*n <= N)
		{
			int j = 2*n;
			if (j < N && pq[j]<pq[j+1]) j++;
			if (pq[n]>=pq[j]) break;
			
			temp = pq[n];
			pq[n] = pq[j];
			pq[j] = temp;
			n = j;
		}
	}	
	
	private void sink2(int n)
	{
		int temp;
		while (2*n <= N2)
		{
			int j = 2*n;
			if (j < N2 && pq2[j]>pq2[j+1]) j++;
			if (pq2[n]<=pq2[j]) break;
			
			temp = pq2[n];
			pq2[n] = pq2[j];
			pq2[j] = temp;
			n = j;
		}
	}	
	
	public int delMax()
	{
		int max = pq[1]; 
		int temp = pq[1];
		pq[1] = pq[N];
		pq[N] = temp;
		N--;
		sink(1);
		return max;
	}
	
	public int delMin()
	{
		int min = pq2[1]; 
		int temp = pq2[1];
		pq2[1] = pq2[N2];
		pq2[N2] = temp;
		N2--;
		sink2(1); 
		return min;
	}
	
	public int get_size()
	{
		return N;
	}
	
	public int findmax()
	{
		return pq[1];
	}
	
	public int findmin()
	{
		return pq[N-1];
	}
	
	public boolean isEmpty()
	{
		return N == 0; 
	}
	

	

}
