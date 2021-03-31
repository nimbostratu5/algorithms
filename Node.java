
public class Node {
	
	int key;
	Node next;
	boolean dead;//for the Josephus Problem
	
	Node(int value)
	{
		key = value;
		next = null;
		dead = false;//for the Josephus Problem
	}

}
