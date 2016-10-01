/* Shiraaz Peerkhan
 * CSCI-UA 101-004
 */

//import scanner for user input
import java.util.Scanner;

public class Pyramid {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		//prompt user for height
		System.out.print("Enter the height of your pyramid △ \n> ");
		
		int num = input.nextInt();
		//start a for loop for number of rows (height)
		for (int i = 1; i <= num; i++) {
		    	//for loop for spaces BEFORE the number
		    	for (int j = num; j > i; j--) {
		    		String lnum = Integer.toString(j);
		    		int llnum = lnum.length();
		    		String space = "";
		    		for (int k = 0; k <= llnum; k++) {
		    			space += " ";
		    		}
			        System.out.print(space);
			       }
		    	//for loop for numebers and spaces 
		    	//between descending numbers (excluding 1)
		    	for (int j = i; j > 1; j--) {
			        System.out.print(j + " ");
			       }
		    	//for loop for ascending numbers with single
		    	//inter space. 
			    for (int j = 1; j <= i; j++) {
			    	
			        System.out.print(j + " ");
			       } 
			       
		//print PYRAMID!!
		System.out.println();
	    }
	
	}

}
