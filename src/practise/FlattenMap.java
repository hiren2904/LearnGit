package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlattenMap {

	public static void main(String []args) {
		Map<Integer, List<Integer> > map = new HashMap<>();
        map.put(1, Arrays.asList(1, 2));
        map.put(2, Arrays.asList(3, 4, 5, 6));
        map.put(3, Arrays.asList(7, 8, 9));
        
        List<Integer> flatList = flattenStream(map.values());
        
        System.out.println(flatList);

  
	}

	public static <T> List<T> flattenStream(Collection<List<T> > lists)
    {
  
        // Create an empty list to collect the stream
        List<T> finalList = new ArrayList<>();
  
        // Using forEach loop
        // convert each list into stream
        // and add the stream into list
        for (List<T> list : lists) {
            list.stream()
                .forEach(finalList::add);
        }
  
        // Return the final flattened list
        return finalList;
    }
  
	
	
}












