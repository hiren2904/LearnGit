package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExampleListMap 
{

	public static void main(String[] args)
	{
		HashMap<String, List<String>> javaBooksAuthorsMap = new HashMap<>();
		HashMap<String, List<String>> phpBooksAuthorsMap = new HashMap<>();
		
		List<HashMap<String,List<String>>> booksAuthorsMapsList = new ArrayList<>();
		
		javaBooksAuthorsMap.put("Head First Java",Arrays.asList("Kathy Sierra","Bert Bates"));
		javaBooksAuthorsMap.put("Effective Java", Arrays.asList("Joshua Blotch"));
		javaBooksAuthorsMap.put("OCA Java SE 8",Arrays.asList("Kathy Sierra","Bert Bates","Elisabeth Robson"));
		
		phpBooksAuthorsMap.put("The Joy of PHP", Arrays.asList("Alan Forbes"));
		 phpBooksAuthorsMap.put("Head First PHP & MySQL", Arrays.asList("Lynn Beighley", "Michael Morrison"));
		

		 booksAuthorsMapsList.add(javaBooksAuthorsMap);
		 booksAuthorsMapsList.add(phpBooksAuthorsMap);
		 
		 System.out.println("Java Map----"+javaBooksAuthorsMap);
		 System.out.println("======================================");
		 System.out.println("Php Map----"+phpBooksAuthorsMap);
		 System.out.println("======================================");
		 System.out.println("Key set java"+booksAuthorsMapsList.get(0).keySet());
		 System.out.println("======================================");
		 System.out.println("keyset Php"+booksAuthorsMapsList.get(1).keySet());
		 
		 System.out.println("++++++++++Result+++++++++++++++++");
System.out.println(booksAuthorsMapsList.get(0).keySet().containsAll(javaBooksAuthorsMap.keySet().stream().collect(Collectors.toList())));
System.out.println(booksAuthorsMapsList.get(1).keySet().containsAll(phpBooksAuthorsMap.keySet().stream().collect(Collectors.toList())));	 
		// assertTrue(booksAuthorsMapsList.get(0).keySet()).containsAll(javaBooksAuthorsMap.keySet().stream().collect(Collectors.toList()));
	}




}


































