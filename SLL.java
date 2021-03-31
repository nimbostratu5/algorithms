
public class SLL {

	//Singly-Linked-List
	
	Node head;
	int count=0; //counts the number of nodes created
				
	public void insert(int val)
	{
		if(count ==0)
		{
			Node new_node = new Node(val);
			head = new_node;
		}
		else
		{
			Node new_node = new Node(val);
			new_node.next = null;
			Node temp = head;
			
			while(temp.next != null)
			{
				temp = temp.next;
			}
		
			temp.next = new_node;
		}
		count++;
	}
	
	public Node search(int k_element)
	{
		if(head == null || k_element > count) 
		{
			System.out.println("Position not found");
			return null;
		}

		else 
		{
			Node temp = head;
			int c = 0;
			while(k_element != c) 
			{
				temp = temp.next;
				c++;
			}
			return temp;
		}
		
	}
	
	public void delete(int k_element)
	{
		Node to_be_deleted = search(k_element);
		if(to_be_deleted == null)
		{
			System.out.println("Nothing to delete");
			return;
		}
		if(to_be_deleted == head)
		{
			head = to_be_deleted.next;
			to_be_deleted = null;
		}
		else
		{
			Node previous = search(k_element-1);
			previous.next = to_be_deleted.next;
			to_be_deleted = null;
		}
		count--;
	}
	
	public boolean isEmpty()
	{
		if (head == null)
			return true;
		else
			return false;
	}
	
	public void print() 
	{
		Node print = head;
		
		for(int i=0;i<count;i++)
		{
			System.out.println(print.key+", "+print.next);
			print = print.next;
		}
	}
	
	public int max(Node first)
	{
		if(first == null)
		{
			return 0;
		}
		else
		{
			Node max = first;
			while(first.next != null)
			{
				if(first.next.key > first.key)
					{
						max = first.next;
					}
				
				first = first.next;
			}
			return max.key;
		}
	}
	
}
