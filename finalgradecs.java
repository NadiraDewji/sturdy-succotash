
public class finalgradecs {
	public static void main(String[] args){
	double[] myHomeWork = {(30/30),0.89, 0.963, (66.5/70), (58.5/50)+(45/40)};
	double [] myQuiz = {.9,.933,(15/15),(14.33/15),(15/15),(12/12)};
	double Midterm1 = 78.5;
	double Midterm2 = 102.5;
	double finalExam = 76;
	
	double grade = (getAverage(myHomeWork)*.20) + (getAverage(myQuiz)*.05)+( Midterm1*.15)+(Midterm2*.25)+(finalExam*.35);
	System.out.print(grade);
	
	
	}
	public static double getAverage(double[] hw){
		double total=0;
		for(double grade: hw){
			total+=(grade)*100;
			
		}
		return (total/hw.length);
		
		
	}
}
