import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Q_3_1_1 {

	public static void main(String[] args) {

//		Using class ST
		
//		Initializing
		Scanner input = new Scanner(System.in);		
		ST<String, Double> st;
		st = new ST<String, Double>(11);
		int i =0,counter=0;
		double sum=0;
		double value;
		String key;
		
//		Mapping letter grades to numerical scores
		st.put("A+", 4.33);
		st.put("A", 4.00);
		st.put("A-", 3.67);
		st.put("B+", 3.33);
		st.put("B", 3.00);
		st.put("B-", 2.67);
		st.put("C+", 2.33);
		st.put("C", 2.00);
		st.put("C-", 1.67);
		st.put("D", 1.00);
		st.put("F", 0.00);
		
//		Capture input
		System.out.println("Enter the grades:");
		String grade_list = input.nextLine();
		if(grade_list.isEmpty() == true)
			return;

//		Find given value in ST from key + print & store returned value 
		while(i<grade_list.length()-2)
		{
			key = grade_list.substring(i, grade_list.indexOf(" ", i));
			value = st.get(key);
			System.out.println(key+" : "+value);
			sum = sum + value;
			counter++;	
			i = i + key.length() +1;
		}
		
//		Process the last grade
		key = grade_list.substring(i,grade_list.length());
		value = st.get(key);
		System.out.println(key + " : " + value);
		sum = sum + value;
		counter++;
		
//		Output GPA
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\n" +"GPA : "+ df.format((sum/counter)));

	}
	
}
