import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class testclothes {
	public static void main(String[] args){
		ArrayList<shirts> myShirts = new ArrayList<shirts>();
		Scanner input = new Scanner(System.in);
		boolean q = true;
		while (q){
			System.out.print("Would you like to add shirts to your shopping cart or quit?");
			String decision = input.nextLine();
			if(decision!="q"){
				q = true;
			}
			else{
				q=false;
				break;
			}
			System.out.println("Please add some shirts how many tshirts do you wanna buy?");
			int amountofTs = input.nextInt();
			for(int i =0; i<amountofTs; i++){
				System.out.println("What size? XS, S, M, L, XL");
				String size = input.nextLine();
				System.out.println("Sleeved or nah?");
				boolean sleeved = input.nextBoolean();
				System.out.print("How much do you wanna pay?");
				double price = input.nextDouble();
				myShirts.add(new tshirts(size, price, sleeved));	
			}
			System.out.println("Please add some dress shirts how many tshirts do you wanna buy?");
			int amountofDTs = input.nextInt();
			for(int i =0; i<amountofDTs; i++){
				System.out.println("What size? XS, S, M, L, XL\n");
				String size = input.next();
				input.nextLine();
				System.out.println("Sleeved or nah?\n");
				String sleevedS = input.nextLine();
				boolean sleeved = true;
				if(sleevedS.equals("y")){
					 sleeved = true;
				}
				else{
					 sleeved = false;
				}
				System.out.print("How much do you wanna pay?\n");
				String priceS = input.nextLine();
				double price = Double.parseDouble(priceS);
				myShirts.add(new tshirts(size, price, sleeved));	
			}
			
			
		}
		for (shirts shirt: myShirts){
			System.out.println(shirt.toString());
		}
		
	}

}
