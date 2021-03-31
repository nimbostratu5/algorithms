
public class RingBuffer {

	//Note: this RingBuffer may not be complete; it however meets the requirement for the 
	//question.
	
	//A RingBuffer could extend SLL but I wanted to practice my coding.
	
	int size;
	Node head;
	Node tail;
	
	RingBuffer(int s)
	{
		if(s==0)
			return;
		size = s;
		
		for(int i=0; i<s;i++)		
		{
			Node new_person= new Node(i);
			if(i==0)
			{
				head = new_person;
				tail = head;
			}
			else
			{
			tail.next = new_person;
			tail = new_person;
			tail.next = head;
			}
		}
	}
	
	public int get_head_index()
	{
		return head.key;
	}
	
	
	
	
	
}
