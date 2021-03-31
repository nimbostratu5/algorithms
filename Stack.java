
public class Stack {
	
	private int size;
	private int n=0;
	private char[] a;
	
	Stack(int s)
	{
		size = s;
		a = new char[s];
	}
	
	void push(char c)
	{
		a[n++] = c;
	}
	
	public char pop() 
	{
		return a[--n];
	}
	
	public char top()
	{
		char c = pop();
		push(c);
		return c;
	}
	
	boolean isEmpty()
	{
		if(n == 0)
			return true;
		else
			return false;
	}
	
	public int get_size()
	{
		return size;
	}
	
	
	
	

}
