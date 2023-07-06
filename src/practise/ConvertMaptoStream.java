package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class ConvertMaptoStream {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "best");
		map.put(3, "programing");
		
		Stream<Map.Entry<Integer,String>> stream = convertMapToStream(map);
		
		System.out.println("Stream"+Arrays.toString(stream.toArray()));
		
	}

	private static Stream<Entry<Integer, String>> convertMapToStream(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		return map.entrySet().stream();
	}

}
