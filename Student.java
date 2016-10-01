/**
 * 
 * @author NadiraDewji
 *
 */
public class Student extends Person {
	/**
	 * initializes the data fields
	 */
	private String netId;
	private String major = "Undeclared";
	/**
	 * the constructor that takes in arguments
	 * @param first the first name
	 * @param middle the middle name
	 * @param last the last name.
	 */
	public Student(String first, String middle, String last){
		setName(first, middle, last);
		generateNetId();
	}
	/**
	 * generates the id by concatenating the initials
	 */
	private void generateNetId(){
		String id = Character.toString(this.getFirst().charAt(0)).toLowerCase() + Character.toString(this.getMiddle().charAt(0)).toLowerCase()+(Character.toString(this.getLast().charAt(0)).toLowerCase());
		id+=String.valueOf(getCount());
		this.netId = id;
		
		
	}
	/**
	 * 
	 * @param netId possible to overwrite
	 */
	public void setNetId(String netId){
		this.netId = netId;
	}
	/**
	 * check if it is equal
	 */
	public boolean equals(Object obj){
		Student other = (Student) obj;
		if(netId.equals(other.netId)){
			return true;
			
		}
		else{
			return false;
		}
	}
	/**
	 * override method because it has the same signature as the tosTRING in parent
	 */
	@Override
	public String toString(){
		String myString = (this.getFirst()+" " + " "+this.getMiddle() +" "+this.getLast() + " "+this.netId +" "+this.major);
		return myString;
		
	}
		

	

}
