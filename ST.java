import java.util.Iterator;

public class ST<Key extends Comparable<Key>, Value> implements Iterable<Key>{

//***************************************************************************//
//							Q_3_1_1
//***************************************************************************//

	
	@Override
	public Iterator<Key> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	Iterable<Key> keys() {
		return null;
	}
	
	String[] keyarray;
	Double[] valarray; 
	int k =0;
	int v =0;
	Value val;
	ST(int s)
	{
		valarray = (Double[]) new Double[s] ; 
		keyarray = (String[]) new String[s] ; 
	}
	
	public void put(Key key, Value val) 
	{
		valarray[v] = (Double) val;
		keyarray[k] = (String) key;
		v++;
		k++;
	}
	
	public Value get(Key key)
	{
		
		
		for(int i =0; i< keyarray.length;i++)
		{
			if( key.compareTo((Key) keyarray[i]) == 0 )
			{
				val = (Value) valarray[i];
			}
			
		}
		
		return val;
	
	}
	
	public void delete(Key key) {}
	
	public int size() {return 1;}
	
	
	
	
	

}
