package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

	Map<Integer,String> hashmap = new HashMap<>();
	hashmap.put(1,"Ram");
	hashmap.put(2,"Mohan");
	hashmap.put(3,"Raja");
	hashmap.put(4,"poha");
	hashmap.put(5,"Rajesh");
	
	Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
	for(Map.Entry<Integer,String> entry :entries) {
		System.out.println("Key"+entry.getKey()+"& value"+entry.getValue());
	}
		
	}

}
