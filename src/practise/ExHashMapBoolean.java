package practise;

import java.util.HashMap;
import java.util.Map;

public class ExHashMapBoolean {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Jigar");
		map.put(2, "vikas");
		map.put(3, "mahesh");
		map.put(4, "Suresh");
		map.put(5, "Vicky");
		
		if(map.containsKey(6)) {
			System.out.println("Jigar Present");
		}else {
			System.out.println("Wrong Number");
		}
		
		if(map.containsValue("Rakesh")) {
			System.out.println("Mahesh Present");
		}else {
			System.out.println("Wrong number");
		}
	}

}
