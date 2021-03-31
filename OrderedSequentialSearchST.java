import java.util.Iterator;

public class OrderedSequentialSearchST<Key extends Comparable<Key> , Value>{// implements Iterable<Key> {
	
	//Extending Algorithm 3.1 of the textbook
	
	private Node head; // Node that points to the first node in the linked list
	private class Node
	{ 
		// linked-list node
		Key key;
		Value val;
		Node next;
	
		public Node(Key key, Value val, Node next)
		{
			this.key = key;
			this.val = val;
			this.next = next;
		}
	}
	
	OrderedSequentialSearchST()
	{
		head = new Node(null,null,null);
	}
	
	public Value get(Key key)
	{
		// Search for key, return associated value.
		for (Node x = head.next; x!= null; x = x.next)
			if (key.equals(x.key))
		return x.val; // search hit
		
		return null; // search miss
	}
	
	
	public void put(Key key, Value val)
	{
		
		if(head.next == null)
		{	
			Node new_node = new Node(key, val, null);
			head.next = new_node;
		}
		else
		{
			// Search for key. Update value if found; grow table if new.
			for (Node x = head.next; x!= null; x = x.next)
			{
				if (key.equals(x.key))
				{
					x.val = val;
					return;
				} // Search hit: update val.
			}
			
			// Search miss: add key accordingly 
			Node new_node;
			Node x;
			for (x = head; x.next != null; x = x.next)
			{
				if (key.compareTo(x.next.key) < 0)
				{
					new_node = new Node(key,val,x.next);
					x.next = new_node;
					return;
				}
			}
			new_node = new Node(key,val,null);			
			x.next = new_node;
		}
		
	}
	
	public void search(Key key)
	{
		int position =1;
		for (Node x = head.next; x != null; x = x.next)
		{
			if (key.equals(x.key))
			{
				System.out.println("Search hit for key '" + key +"' => "+"value: " + x.val);
				System.out.println("Position: " + position);
				return;
			} // Search hit
			position++;
		}
		// Search miss
		System.out.println("The key '"+ key + "' has not been found.");
	}
	
	public void delete(Key key)
	{
		Node temp;
		for (Node x = head; x!= null; x = x.next)
		{
			if (key.equals(x.next.key))
			{
				temp = x.next.next;
				x.next = null;
				x.next = temp;
				return;
			} 
		}
		System.out.println("Key not found, no delete operation performed.");
	}
	
	public void print()
	{
		for (Node x = head.next; x != null; x = x.next)
		{
			System.out.println("Key: " + x.key + " | " + "Value: " + x.val);
		}
	}
	

}
