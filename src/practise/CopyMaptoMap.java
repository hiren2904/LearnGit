package practise;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CopyMaptoMap {
	
	public static void main(String []args) {
		
		Map<String,String> map=new HashMap<>();
		
		map.put("key_1", "GeeksForGeeks");
		map.put("key_2", "2020");
		
		Hashtable<String,String> hshtable = new Hashtable<>();
		
		hshtable.put("key_1", "HIREN");
		hshtable.put("key4", "HP");
		hshtable.put("key5", "KING");
		
		System.out.println("Hashtable"+hshtable);
		hshtable.putAll(map);

		System.out.println("Map"+map);
		System.out.println("All Values"+hshtable);
		
		
		
	}

}




