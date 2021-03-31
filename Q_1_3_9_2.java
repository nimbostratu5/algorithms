
public class Q_1_3_9_2 {

	public static void main(String[] args) {
		
		/**
		 * In this problem, For a given input, there may be several arithmetic output variations possible.  
		 * I assumed that parentheses are used for terms on the left and right of operator '*'.
		 */
		
		Stack input_stack = new Stack(2*(args[0].toString().length()));
		
		//int p1 and p2 are counters that count for pushed ')' and '(' respectively.
		//p1 and p2 decrease when popping ')' and '(' respectively.
		int p1=0;
		int p2=0;

		//This for-loop will push each character of the input into a stack.
		//At the same time, it checks for missing '(' and adds one when needed.
		for (int i = args[0].toString().length()-1; i>0; i--)
		{	
			if(args[0].charAt(i) == ')')
			{
				p1++;
			}
			
			//if no ')' detected, then the stack will simply push until p > 0 or until end of input is reached
			if(p1 == 0)
			{
				input_stack.push(args[0].charAt(i));
			}

			// may need to change the first if arg to *
			else if(args[0].charAt(i) != ')' && args[0].charAt(i-1) == ')')
			{
				input_stack.push('(');
				p1--;
				p2++;
				if(p2 == p1)
				{
					input_stack.push('(');
					p1--;
					p2++;
				}
				input_stack.push(args[0].charAt(i));
			}
			else
			{
				input_stack.push(args[0].charAt(i));
			}
		}
		
		input_stack.push(args[0].charAt(0));
		
		
		//if there are any remaining parentheses:
		while(p1!=0)
		{
			input_stack.push('(');
			p1--;
		}
		
		//printing the content of the stack
		while(input_stack.isEmpty() == false)
		{
			System.out.print(input_stack.pop());
		}
		
		

	}

}
