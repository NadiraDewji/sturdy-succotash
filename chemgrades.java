
public class chemgrades {
	public static void main(String[] args){

		double postLabs = 84;
		double labQ = 73.333333;
		double labmidtermw= 65;
		double labmidtermP = 93;
		double labFinalP = 70;
		double labFinalW = 70;
		
		double endGrade = (postLabs*.45) + (73*.15) + (labmidtermw*.05) + (labmidtermP*0.05) + (labFinalP*.10) + (labFinalW*0.2);
		System.out.println("Lab End Grade "
				+ ""+endGrade);
		
		double midtermclass = 79;
		double finalexam = 100;
		
				
				
		
		double quiz = 79.3;
		
		double finalfinal = (endGrade*.25) + (midtermclass*.60 + finalexam*.30 + quiz*.10)*.75;
		System.out.println("Lecture Grade " +(midtermclass*.60 + finalexam*.30 + quiz*.10));
		System.out.println("Final Class Grade "+finalfinal);
		
		
		
//		String s = "hey";
//		Object t = s;
//		System.out.print(s)
		;
//		
//		Object one = new Candidate("nadira", "f", "n18");
//		Candidate two = (Candidate) one;
//		
//		Object three = new Object();
//		Candidate four = (Candidate) three;
//		System.out.print(four.toString());

	}

}
