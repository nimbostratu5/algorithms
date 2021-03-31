import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Q_2_5_9 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		
	//	String line1 = "4-Jan-00 1000900000";
	//	String line2 = "5-Jan-00 1085500032";
	//	String line3 = "1-Oct-28 3500000";
	//	String line4 = "3-Oct-28 40600000";
		//String line5 = "1-Aug-99 123456";

		try {
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//I was writing my own read and print-to-file classes until I discovered
			//the built in methods..
			//The DataFile and DataLine classes are thus unnecessary but I was too far in to 
			//not use them as the foundation of the code is built using those 2 classes
			//which is why the number of lines of the input file is needed before starting..
			
			//DataLine parses.
			//DataFile was suppose to be the output function+sorting input
			
			DataFile myfile = new DataFile(5);
			String str;
			
			//Get input File
			while( ((str=br.readLine()) != null) )
			{
				//DataLine new_data = new DataLine(str);
				myfile.insertData(str);
			}
			br.close();
			System.out.println("File contents:");
			myfile.print();
			System.out.println("------------");
			SortMergeLibrary.HeapSort(myfile.get_file());
			myfile.print();
			
			//Output file
			FileWriter fw = new FileWriter("sortedinput.txt");
			PrintWriter pw = new PrintWriter(fw);
			for(int i =0;i<5;i++) {
			pw.println(myfile.print2(i));
			}
			pw.close();
			
		} 	catch (IOException e)
		{
			System.out.println("File not found");
		}		
		
		//below is just some testing
	
		//myfile.insertData(line1);
		//myfile.insertData(line2);
		//myfile.insertData(line3);
		//myfile.insertData(line4);
		//myfile.insertData(line5);
		
		//myfile.print();
		
		//SortMergeLibrary.HeapSort(myfile.get_file());

		//myfile.print();

	} 

}
