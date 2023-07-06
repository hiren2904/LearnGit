package practise;
import java.util.*;

public class ExampleMap {
	private static final boolean Integer = false;
	public static void main(String []args)
	{
		Map<Integer,String> details = new HashMap<>();
		List<Integer> list = new ArrayList<>();

		details.put(1, "Hiren");
		details.put(2, "Akash");
		details.put(3, "Pratap");
		details.put(4, "Hiren");
		details.put(5, "hiren");
		
		if(details.containsValue("Hiren")) {
			System.out.println("HHH");
		}
		
//		for (Integer i : details.keySet()) {
//			
//			if(details.get(i).contains("Hiren")) {
//				list.add(i);
//			}
//		}
		//System.out.println(list);
			
	}

}














