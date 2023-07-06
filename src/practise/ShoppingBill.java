package practise;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingBill {

	public static void main(String[] args) {
		
		String productName = null;
	    int quantity = 0;
	    double price = 0.0;
	    double totalPrice = 0.0;
	    double overAllPrice = 0.0;
	    char choice = '\0';
	    
	    Scanner sc = new Scanner(System.in);
	    
	    List<Product> list = new ArrayList<>();
	  
	    do {
	    System.out.println("Enter product name");
	    productName = sc.next();
	    System.out.println("Enter  Quantity");
	    quantity = sc.nextInt();
	    System.out.println("Enter unit Price");
	    price  = sc.nextDouble();
	    
	    totalPrice = price * quantity;
	    
	    overAllPrice += totalPrice;
	    	    
	    list.add(new Product (productName,quantity,price,totalPrice));
	    
	    System.out.println("Want to add More Items? (y or N) ");
	    
	    
	    
	    }while(choice == 'Y' || choice == 'Y');
	    
	    Product.displayformat();
	    
	    for(Product p: list) {
	    	p.display();
	    }
	    System.out.println("\nTotal Price = " + overAllPrice);

	}
	
    
}



class Product {
	  // properties
	  private String pname;
	  private int qty;
	  private double price;
	  private double totalPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
	System.out.format("%-9s %8d %10.2f %10.2f\n", pname, qty, price, totalPrice);
	}
	public static void displayformat() {
	System.out.print("\nName  Quantity    Price   Total Price\n");		
	}
	public Product(String pname, int qty, double price, double totalPrice) {
		super();
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", qty=" + qty + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}
	  
}








