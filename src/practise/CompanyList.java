package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompanyList {

	public static void main(String[] args) {

		List<String> companylist = new ArrayList<>();
		companylist.add("google");
		companylist.add("Apple");
		companylist.add("Microsoft");
		
		//companylist.stream().sorted().forEach(System.out::println);
		Comparator<String> com =(String o1, String o2) -> o1.compareTo(o2);
		Collections.sort(companylist,com);
		
		for(String name :companylist) {
			
			System.out.print(name);
			
		}
		
	}

}
