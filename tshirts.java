
public class tshirts extends shirts {
	private boolean sleeved;
	private static int tshirtsid;
	
	public tshirts(){
		System.out.print("Hi");

	}
	public tshirts(String size, double price, boolean sleeved){
		super(size, price);
		this.sleeved = sleeved;
		tshirtsid = this.id;
	}
	
	public String toString(){
		String s = String.format("Type: T Shirt, Size: %s, Sleeved: %s, Price: %.2f", this.getSize(), this.sleeved,this.getPrice());
		return s;
	}

}
