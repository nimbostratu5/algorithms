
public class DataLine {
	
	private int value;
	private int year;
	private int month;
	private String alphamonth;
	private int day;
	
	DataLine(String line)
	{
		value = Integer.parseInt(line.substring(line.indexOf(' ')+1, (line.length()) ));
		day = Integer.parseInt(line.substring(0, line.indexOf('-')));
		year = Integer.parseInt(line.substring(line.lastIndexOf('-')+1, line.indexOf(' ')));
		
		alphamonth = line.substring(line.indexOf('-')+1, line.lastIndexOf('-'));
		
		if(alphamonth == "Jan"){
			month = 1;
		}
		else if(alphamonth == "Feb"){
			month = 2;
		}
		else if(alphamonth == "Mar"){
			month = 3;
		}
		else if(alphamonth == "Apr"){
			month = 4;
		}
		else if(alphamonth == "May"){
			month = 5;
		}
		else if(alphamonth == "Jun"){
			month = 6;
		}
		else if(alphamonth == "Jul"){
			month = 7;
		}
		else if(alphamonth == "Aug"){
			month = 8;
		}
		else if(alphamonth == "Sep"){
			month = 9;
		}
		else if(alphamonth == "Oct"){
			month = 10;			
		}
		else if(alphamonth == "Nov"){
			month = 11;
		}
		else if(alphamonth == "Dec"){
			month = 12;
		}
		
	}
	
	
	public int get_value()
	{
		return value;
	}
	
	public int get_year()
	{
		return year;
	}
	
	public int get_month()
	{
		return month;
	}
	
	public int get_day()
	{
		return day;
	}
	
	public void print()
	{
		System.out.println(day+"-"+alphamonth+"-"+((year == 0) ? "00" : year)+" "+value);
	}

	public String print2()
	{
		return (day+"-"+alphamonth+"-"+((year == 0) ? "00" : year)+" "+value);
	}
}
