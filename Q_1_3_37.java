
public class Q_1_3_37 {
	
	public static void main(String[] args) {

		//The first person is set @ 0 and the last person @ N-1
		int N = Integer.parseInt(args[0].toString());
		int M = Integer.parseInt(args[1].toString());
		
		//Some special cases to account for:
		if(N == 1 && M > 0)
		{
			System.out.println("1");
			return;
		}
		else if(N == 0 || M == 0)
		{
			System.out.println("Requirements not met");
			return;
		}
		
		//Visually, this problem is basically akin to a RingBuffer.
		//A RingBuffer is simple a linked-list where the tail of the list points to the head
		//thus closing a loop.
		RingBuffer circle = new RingBuffer(N);
		
		Queue queue = new Queue(); //creates a queue.
		Node temp = circle.head; //assigning a temp Node which will act as the Iterator.
		int counter = 1; //counter to keep up with the eliminated people.
		
		while(queue.count<N) //until every person is eliminated
		{
			//this loop iterates around the circle and skips whoever is dead.
			while(counter !=M) 
			{
				if(temp.next.dead == false)
				{
					temp = temp.next;
					counter++;
				}
				else
				{
					temp = temp.next;
				}
			}
			counter=0;
			queue.enqueue(temp.key);
			temp.dead = true;
		}
		
		//prints out the order in which people are eliminated
		while(queue.count >0)
		{
			System.out.print(queue.dequeue()+" ");
		}
	}
	
}
