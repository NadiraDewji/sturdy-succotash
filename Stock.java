
/***
 * Intro to Computer Science
 * @author NadiraDewji
 *
 */
public class Stock {
		String symbol;
		String name;
		double previousClosingPrice;
		double currentPrice;
		/**
		 * made this constructor that takes in two parameters.
		 * @param symbol
		 * @param name
		 */
		public Stock(String symbol, String name){
			previousClosingPrice = 0;
			currentPrice = 0;
			this.symbol = symbol;
			this.name = name;
				
		}

		
		 public double getChangePercent(){
			return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
		}
	

}
