package practise;

import java.io.ByteArrayOutputStream;

public class Test {

	public static void main(String args[]) throws Exception 
	{
		  ByteArrayOutputStream bios = new ByteArrayOutputStream();
		  
		  byte[] bs = { 71, 69, 69, 75, 83 };
				  
		  bios.write(bs);
		  
		  String str = bios.toString();
	      System.out.println(str);   
		  
	}
}
