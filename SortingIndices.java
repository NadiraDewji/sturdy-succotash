import java.util.Scanner;
public class SortingIndices {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double[][] a = new double [3][3];
	double[][] b = new double [3][3];
	

	System.out.print("Please Enter Matrix 1 :");
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			double element = input.nextDouble();
				a[i][j] = element;
		}
	}
	System.out.print("Please Enter Matrix 2 :");
	for(int i=0; i<b.length; i++){
		for(int j=0; j<b[i].length; j++){
			double element = input.nextDouble();
				b[i][j] = element;
		}
	}
	
	print2d(a);
	System.out.println();
	print2d(b);
	System.out.println();
	print2d(multiplyMatrix(a,b));
	System.out.println();
	printMatrix(a, b, multiplyMatrix(a,b));

		
}
		
//	
//	int sum =0;
//	 double[][] workHours = {
//		      {2, 4, 3, 4, 5, 8, 8},
//		      {7, 3, 4, 3, 3, 4, 4},
//		      {3, 3, 4, 3, 3, 2, 2},
//		      {9, 3, 4, 7, 3, 4, 1},
//		      {3, 5, 4, 3, 6, 3, 8},
//		      {3, 4, 4, 6, 3, 4, 4},
//		      {3, 7, 4, 8, 3, 8, 4},
//		      {6, 3, 5, 9, 2, 7, 9}};
//	 
//	double[] totalHours = new double[8];
//	for(int i=0; i<workHours.length; i++){
//		sum=0;
//		for(int j=0; j<workHours[i].length; j++){
//			sum+= workHours[i][j];
//		}
//		totalHours[i] = sum;
//		
//	}
//	
//	String Index = "";
//	for(int k=0; k<totalHours.length; k++){
//		int min =k;
//		for(int l=k+1; l<totalHours.length; l++){
//			if (totalHours[l] <totalHours[min]){
//				min = l;
//
//			}
//		}	
//		if(k!=min){
//			double tmp = totalHours[min];
//			totalHours[min] = totalHours[k];
//			totalHours[k] = tmp;
//
//
//		}
//
//		Index+= min;
//		System.out.print(Index);
//		System.out.println();
//
//	}
////	for(int i =0; i<totalHours.length; i++){
////		System.out.print(totalHours[i]+ "Employee"+((Index.charAt(i))+"\n"));
////		
//	}

	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] c= new double[a.length] [a[0].length];
		for(int i=0; i< a.length; i++){
			for(int j=0; j<a[i].length; j++){
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		return c;
	}
	
	public static void printMatrix(double[][] a, double[][] b, double [][] c){
		String Matrix = "";
		for (int i=0; i<3; i++){
			System.out.print(Matrix);
			Matrix ="";
			for(int j =0; j<a.length; j++){
				Matrix+= a[i][j]+ " ";
			}
			Matrix += "   ";
			for(int j=0; j<b.length; j++){
				Matrix+= b[i][j] +" ";
			}
			Matrix += "   ";
			for(int j=0; j<c.length; j++){
				Matrix+= c[i][j] + " ";
			}
			System.out.println();


		}


	}
	public static void print2d(double[][] m){
		for (int i=0; i< m.length; i++){
			for(int j=0; j<m.length; j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
