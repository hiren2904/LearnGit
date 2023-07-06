package practise;
import java.util.*;
public class DemoMap {
	public static void main(String []args) 
	{
		Map<Integer,String> lang = new HashMap<>();
		lang.put(1, "Java");
		lang.put(2, "Python");
		lang.put(3, "C");
		lang.put(4, "sql");
		
		System.out.println(lang);
		lang.replaceAll((key,value)->value.toUpperCase());
		System.out.println(lang);
		
		System.out.println(lang.get(1));
		
	}

}
