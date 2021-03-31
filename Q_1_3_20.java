import java.util.Scanner;

public class Q_1_3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		SLL mylist = new SLL();
		for ( int i = 0; i<args.length; i++)
		{	
			mylist.insert(Integer.parseInt(args[i].toString().replaceAll(",", "")));
		}
		
		System.out.print("Delete at: ");
		int index = keyboard.nextInt();

		System.out.println("Before Deleting Element at "+index);
		mylist.print();
		
		mylist.delete(index);
		
		System.out.println("After Deleting Element at "+index);
		mylist.print();
			
	}

}
