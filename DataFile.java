
public class DataFile {

	private DataLine[] file;
	private int cursor = 0;
		
	DataFile(int N)
	{
		file = (DataLine[]) new DataLine[N];
	}
	
	public void insertData(String line)
	{
		DataLine new_line = new DataLine(line);
		file[cursor] = new_line;
		cursor++;
	}
	
	public void print()
	{
		for(int i=0;i<file.length;i++)
		{
			file[i].print();
		}
		System.out.println();
	}
	
	public String print2(int i)
	{
		
			return file[i].print2();

	}
	
	public DataLine[] get_file(){
		
		return file;
	}
	
	public int get_size()
	{
		return file.length;
	}
}
