
public class Q_3_1_3 {
	
	public static void main(String[] args) {

// 		Testing client for Q3.1.3
//		Using class OrderedSequentialSearchST
		
//		Testing the insert, print, search and delete methods
		
//		NOTE: In the TestCase pdf, it wants to insert "values";
//		I assumed that translates into insert *keys* with an associated value
//		My code here performs the functions using keys.

//		Initialization 
		OrderedSequentialSearchST<String, Integer> oST = new OrderedSequentialSearchST<String, Integer>();
				
		oST.put("B", 2);
		oST.put("C", 3);
		oST.put("D", 4);
		oST.put("E", 5);
		oST.print();
		System.out.println("---");
		
		oST.put("A", 1);
		oST.print();
		System.out.println("---");

		oST.delete("C");
		oST.print();
		System.out.println("---");
		
		oST.search("C");
		oST.search("B");
		oST.search("A");
		
		oST.put("Z", 2);
		System.out.println("---");
		oST.print();
		oST.search("Z");
		
		oST.put("A", 12);
		oST.put("B", 15);
		oST.put("Z", 15);
		oST.print();
		

	}
	
}
