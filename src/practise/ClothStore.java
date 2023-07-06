package practise;

import java.util.ArrayList;
import java.util.List;

public class ClothStore {

	public static void main(String[] args) {

		List<String> cloth = new ArrayList<>();
		
		cloth.add("Tshirt");
		cloth.add("Jeans");
		cloth.add("Pents");
		
		cloth.stream().sorted().forEach(System.out::println);
		
	}

}
