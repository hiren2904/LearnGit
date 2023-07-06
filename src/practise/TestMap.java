package practise;
import java.util.*;
public class TestMap {
	
	public static void main(String []args) {
		
		Map<String,String> countries =new HashMap<>();
		
		countries.put("washington", "America");
		countries.put("Ottawa", "Canada");
		countries.put("Canbara", "Australia");
		
		
		countries.replace("washington", "America", "USA");
		System.out.println(countries);
		
		 
		
	}

	
}
