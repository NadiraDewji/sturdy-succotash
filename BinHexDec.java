/**
 Nadira Azim Dewji
 Introduction To Computer Programming 
 **/
import java.util.Scanner;
public class BinHexDec {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a hex (0x) or binary (0b) number:");
		String Number = input.next();
		int decimal;
		int k =0;
		String type="";
		int i;
		int value=0;
		int sum = 0;
		int Power = Number.length()-3;
// You want to make sure you have an else if statement to see if its a binary digit
//Then you want to start iterating after the second index and see if it falls between 48 and 48+9
//You also want to check if its between A-F
//To see which character/letter it is instead of using so many else if statements just subrtract it from F and subtract from 15.
//You next want to convert it into decimal by rasing it to the power that is incremented with 16 as base.
//With every additional number starting from the left the power is decreasing by 1.
		if (Number.substring(0, 2).equals("0x") && (Number.length() > 2)){
			for (i= 2; i<(Number.length()); i++){
				if (((Number.charAt(i)) >= 48 && (Number.charAt(i)) <= (9+48)) || ((Number.charAt(i)) >= 'A' && (Number.charAt(i)) <= 'F')) {
					if (Number.charAt(i)>=48 && Number.charAt(i) <= (9+48)){
						value = ((Number.charAt(i)-48));
					}
					else{
						value = (15-('F'-(Number.charAt(i))));
					}

					decimal = ((int) Math.pow(16, Power))*(value);
					sum+= decimal;
					type = "base-16";
					
				}
			
// You want to make sure you have an else if statement to see if its a binary digit
//Then you want to start iterating after the second index and see if it falls between 48 and 48+9
//You next want to convert it into decimal by rasing it to the power that is incremented with 2 as base.
//With every additional number starting from the left the power is decreasing by 1. 
				else{
					System.out.print("Error parsing base-16 to base-10");
					k=1;
					break;
				}
				Power--;
			}
		}
		else if(Number.substring(0, 2).equals("0b") && (Number.length() > 2)){
			for (i= 2; i<(Number.length()); i++){
				if (Number.charAt(i)>=48 && Number.charAt(i) <= (9+48)){
					value = ((Number.charAt(i)-48));
					decimal = ((int) Math.pow(2, Power))*value;
					sum+= decimal;
					type = "base-2";

				}
				else{
					System.out.print("Error parsing base-2 to base-10");
					k=1;
					break;
				}
				Power--;
//Make a variable k so you know not to print our the total sum at the end if there is an error.				
			}
		}
		else{
			System.out.print(" I don't know how to covert that number");
			k =1;
		}
		if (k!=1){
			System.out.printf("Converting from %s to base-10\n %s", type, sum);

		}
	}

}
