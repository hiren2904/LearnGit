package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListAndHashMap
{
	public static void main(String [] args) {
		
		List<Map<String,String>> list= new ArrayList<>();
		Map<String,String> fruitmap=new HashMap<>();
		fruitmap.put("f1", "Mango");
		fruitmap.put("f2", "Grape");
		fruitmap.put("f3", "Apple");
		fruitmap.put("f4", "Watermelon");
		
		Map<String,String> vegmap=new HashMap<>();
		vegmap.put("v1", "ladyfinger");
		vegmap.put("v2", "brokoli");
		vegmap.put("v3", "potato");
		
		list.add(vegmap);
		list.add(fruitmap);
		System.out.println("List"+list);
		for(int i=0;i<list.size();i++) {
			Map<String,String> tmpmap=list.get(i);
			Set<String> key=tmpmap.keySet();
			Iterator it = key.iterator();
			while(it.hasNext()) {
				
				String hmkey = (String) it.next();
				String hmdata = tmpmap.get(hmkey);
				System.out.println(hmkey+"::"+hmdata);
				
			}
		}

	}

}




