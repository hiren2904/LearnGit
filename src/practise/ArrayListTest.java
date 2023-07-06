package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	
	public static <E> void main(String []args) 
	{
		List<String> list= new ArrayList<>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		Iterator itr = list.iterator();	
		System.out.println(itr);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
