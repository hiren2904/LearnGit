package practise;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

	public static void main(String[] args) 
	{
		List<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(7);
		arrList.add(8);
		
		// arrList.forEach((n)->System.out.println(n));
		
		arrList.forEach((n)->
		{
			if(n%2==0) {
				System.out.println(n);
			}
		});

	}

}














