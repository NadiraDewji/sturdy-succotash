
public class Triangle {
	private Point[] myArray = new Point[3];
	private double perimeter;
	private double area;
	
	public Triangle(Point one, Point two, Point three){
		this.myArray[0] = one;
		this.myArray[1] = two;
		this.myArray[2] = three;
	}
	
	public double calPerimeter(){
		double sum=0;
		sum+= myArray[0].distance(myArray[1]);
		sum+=myArray[1].distance(myArray[2]);
		sum+=myArray[2].distance(myArray[0]);
		System.out.print(sum);
		return sum;


	}
	
	public boolean isoceles(){
		if((myArray[0].distance(myArray[1]) == myArray[1].distance(myArray[2])) && (myArray[2].distance(myArray[0])== myArray[0].distance(myArray[1]))){
			return true;
		}
		else{
			return false;
		}
		
	}
	

}
