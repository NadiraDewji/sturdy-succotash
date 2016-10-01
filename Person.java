/**
 * 
 * @author NadiraDewji
 *
 */
public class Person {
	private String first;
	private String middle;
	private String last;
	private static int count;
	/**
	 * person constructor that increments every count and prints out the count witht the student
	 */
	public Person(){
		count+=1;
		System.out.printf("Creating Peron #%d\n", count);
	}
	/**
	 * 
	 * @param first takes in a first name
	 * @param middle take sin a middle name
	 * @param last takes in alast name
	 */ 
	public Person(String first, String middle, String last){
		this();
		setName(first, middle, last);
	}
	/**
	 * 
	 * @return the first name
	 */
	public String getFirst() {
		return first;
	}
	/**
	 * 
	 * @return the middle name
	 */
	public String getMiddle() {
		return middle;
	}
	/**
	 * 
	 * @return the last name
	 */
	public String getLast() {
		return last;
	}
	public static int getCount() {
		return count;
	}
	/**
	 * 
	 * @param first takes in the first name
	 * @param middle takes in the middle name
	 * @param last takes in the last name
	 */
	
	public void setName(String first, String middle, String last){
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	/**
	 * returns a string concaetation
	 */
	public String toString(){
		String myString = (this.first+" " + " "+this.middle +" "+this.last);
		return myString;
	}
	

}
