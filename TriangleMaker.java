import java.util.Scanner;
public class TriangleMaker {
	public static void main(String[] args){
		Point [] myPoints = new Point[3];
		Scanner input = new Scanner(System.in);
		for(int i =0; i< 3; i++){
			System.out.print("Please enter a coordinate x,y");
			String coords = input.nextLine();
			String[] myChars = coords.split(",");
			myPoints[i] = new Point(Integer.parseInt(myChars[0]), Integer.parseInt(myChars[1]));
		}
		System.out.print(myPoints[0].getDistance(myPoints[2], myPoints[0]));		
		System.out.print("RULE BREAKER");
		Triangle myTriangle = new Triangle(myPoints);
		System.out.print("The triangle's perimeter is" + myTriangle.perimeter());
		myTriangle.isoceles();
		
		
	}

}
