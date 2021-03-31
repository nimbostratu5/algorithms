
public class Queue extends SLL {
	
	//The dequeue() is not to be confused with the delete() of SLL.
	//Here, dequeue() 'deletes' the node that was first inserted, i.e. head;
	//and assigns the new head. 
	public int dequeue()
	{
		Node next_in_queue = head.next;
		int key = head.key;
		head = null;
		head = next_in_queue;
		count--;
		return key;
	}
	
	//Same as the super class but using a different method name
	//to distinguish what class is being used. 
	public void enqueue(int k)
	{
		super.insert(k);
	}
	
	//The isEmpty() is the same as super class'.
	
	

}
