
public class OrganicChemistry {
	public static void main(String[] args){
	int[] postLabs = {((3800/45)),((3700/45)), ((3700/45)),(int)((4000/45)),(int)((4000/45)),(int)((4200/45)),(int)((4300/45)),(int)((3700/45))};
	double [] quizes = {(double)((500/10)), (double)((1000/10)), (double)((700/10))};
	double midtermPractical = (double)(2800/30);
	double midtermWritten = (double) (2800/43);
	double finalPractical = 85.7;
	double finalWriten = 78.57;
	double averagePostLab;
	double averageQuizLab;
	int totalP = 0;
	int totalQ = 0;

	for(double assignment: postLabs){
//		System.out.print(assignment+"\n");
		totalP += assignment;
	}
	averagePostLab = totalP/8;
	for(double quiz: quizes){
		totalQ+= quiz;
	}

	
	averageQuizLab= totalQ/3;
	
	double endLabGrade = ((averagePostLab*.45) + (averageQuizLab*.15) + (midtermWritten*.05) + (finalPractical*0.05) + (finalPractical*.10) + (finalWriten*0.2));
	double midterm1 = 70;
	double midterm2 = 77;
	double midterm3 = 83;
	double finalExam = 68;
	double quizLecture = 79.3;
	double endLectureGrade = (((midterm2+midterm3)/2)*.60 + finalExam*.30 + quizLecture*.10);
	System.out.println(endLabGrade);
	double endCourseGrade = (89*.25) + (((midterm2+midterm3)/2)*.60 + finalExam*.30 + quizLecture*.10)*.75;
	System.out.printf("Hey Nadira! Your current Organic Chemistry grade is %.2f...sucks to be you!\n Your lecture grade is %.2f \n Your lab grade is %.2f assuming you get %.2f  on your practical and %.2f on your written", endCourseGrade, endLectureGrade,endLabGrade,finalPractical, finalWriten );
	
	
	}
}
