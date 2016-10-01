/**
 * Nadira Azim Dewji
 * Intro to computer science**/
import java.util.Scanner;
public class CreditCard {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer:");
		long creditNumber = input.nextLong();
		if (isValid(creditNumber) == false){
			System.out.print(creditNumber+"is invalid");
		}
		else{
			System.out.print(creditNumber+"is valid");
		}
		
		/**The first method determines if it is valid or invalid
		 * This is based on whether the result from step 4 is divisible by 10
		 * Therefore it will take the sum of Step 2 and Step. It wil return a 
		 * boolean 3**/			
		}
	public static boolean isValid(long number){
		if ((number+"").length() >= 13 && (number+"").length()<=16){
			if (prefixMatched(number, 37) == true || prefixMatched(number, 5)== true || prefixMatched(number, 4)==true ||prefixMatched(number, 6)==true){
				
				if ((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number)) % 10 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
		
	}
	/** this method is iterating through the entire credit number backwards through even spaces.
	 * it is then going to double each digit it is then going to call on the getDigit method which takes each iterated number, doubles it
	 * and then checks if it's double digits or single.  **/
	public static int sumOfDoubleEvenPlace(long number){
		int i;
		int finalSum=0;
		int numericDouble;
		String stringNumber1= Long.toString(number);
		for (i=stringNumber1.length()-2; i>=0; i-=2){
			numericDouble = (Character.getNumericValue(stringNumber1.charAt(i)))*2;
			finalSum+= getDigit(numericDouble);
		}
		return finalSum;
	}
	
	/**this method needs to check if the double is greater than two digits or not**/
	public static int getDigit(int number){
		String stringNumber = number+"";
		int j;
		int sum = 0;
		if (stringNumber.length()>1){
			for(j=0; j<stringNumber.length(); j++){
				sum+= Character.getNumericValue(stringNumber.charAt(j));		
			}
			return sum;
		}
		else{
			return number;
		}
		
	}

	public static int sumOfOddPlace(long number){
		int k;		
		int sum=0;
		String stringNumber2 = number+"";
		for (k=stringNumber2.length()-1; k>0; k-=2){
			sum+= Character.getNumericValue(stringNumber2.charAt(k));
		}
		return sum;
	}
	/*this method is supposed to check if the prefix of the number matches one of the four
	 * from 37, 4, 5, 6 and it's going to use the get prefix method to check. **/
	public static boolean prefixMatched(long number, int d){
		String stringNumber = number+"";
		int k;
		int sum=0;
		if (d == getPrefix(number, getSize(d))){
			return true;
		}
		else{
			return false;
		}
	
		}
		
	/* this method is supposed to check the size of the prefix**/
	public static int getSize(long d){
		String dString = d+"";
		int sizeofD = dString.length();
		return sizeofD;
	}
	/* this method is supposed to get the prefix using the get size and the long number**/
	public static long getPrefix(long number, int k){
		String stringNumber = number+"";
		String prefix = "";
		int i;
		for (i=0; i<k; i++){
			prefix += stringNumber.charAt(i);
		}
		long l = Long.parseLong(prefix);
		return l;
		
	}
	

}
