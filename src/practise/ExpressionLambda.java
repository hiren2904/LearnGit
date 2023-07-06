package practise;

interface FuncInterface{
	void abstractFun(int x);
	 default void normalFun()
	    {
	       System.out.println("Hello");
	    }
}

public class ExpressionLambda {

	public static void main(String[] args) 
	{
		FuncInterface fnu = (x)-> System.out.println(2*x);
			
		fnu.abstractFun(5);
		fnu.normalFun();
	}

}




