package practise;

public class HpBrand {

	
	interface FuncInter1{
		int operation(int a,int b);
	}
	interface FunInter2{
		void sayMsg(String msg);
	}
	
	private int operate(int a,int b,FuncInter1 fobj) {
		return fobj.operation(a, b);
	}
	public static void main(String[] args) {
		
		FuncInter1 add = ( x,  y) -> x + y;
		
		HpBrand hpb = new HpBrand();
		
		System.out.println("Addition is"+hpb.operate(2,5,add));
	
	}

}
