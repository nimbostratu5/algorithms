
public class Q_1_3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SLL mylist = new SLL();
		for ( int i = 0; i<args.length; i++)
		{	
			mylist.insert(Integer.parseInt(args[i].toString().replaceAll(",", "")));
		}
						
		System.out.println("max value is: " + mylist.max(mylist.head));
		

	}

}
