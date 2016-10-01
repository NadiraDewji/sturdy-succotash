import java.util.Scanner;
public class SimbaTrailers {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = "";
		int count =0;
		int total = 0;
		while(!input.equals("q")){
			
		System.out.println("Hey Hussein\nWould you like to purchase a (fl)atbed, (fu)el tanker, (l)owbed trailer, (t)ipping trailer or (q)uit");
		input = in.nextLine();
		count =1;

		if(input.equals("fl")){
			System.out.println("Sweet. Your flatbed will cost 100,000$USD");
			total+= 100000;
		}
		else if(input.equals("l")){
			System.out.println("Cool. Your lowbed trailer will cost 200,000$USD");
			total+= 200000;

			
		}
		else if(input.equals("fu")){
			System.out.println("Nice. Your fuel tanker will cost 500,000$USD");
			total+= 500000;


		}
		else if(input.equals("t")){
			System.out.println("Thanks for supporting our business. Your tipping trailer will cost 600,000$USD");
			total+= 600000;


		}

	}
		System.out.printf("Thanks for supporting Simba Trailers. Your total is %s $USD \n See ya", total);

}
}
