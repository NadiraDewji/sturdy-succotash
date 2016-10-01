
public class dressshirts extends shirts {
		private boolean sleeved;
		private static int shirtsid;
		
		public dressshirts(){
		}
		public dressshirts(String size, double price, boolean sleeved){
			super(size, price);
			this.sleeved = sleeved;
			shirtsid = this.id;
		}
		
		public String toString(){
			String s = String.format("Type: Dress Shirt, Size: %s, Sleeved: %s, Price: %.2f", this.getSize(), this.sleeved,this.getPrice());
			return s;
		}
		
	
}
