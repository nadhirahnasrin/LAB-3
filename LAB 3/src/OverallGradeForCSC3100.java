import java.util.Scanner;

public class OverallGradeForCSC3100 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double assessment1, assessment2;
        double labAssignment, finalExam;
        double total;

        System.out.print("Enter mark for Assessment 1: ");
        assessment1 = input.nextDouble();

        System.out.print("Enter mark for Assessment 2: ");
        assessment2 = input.nextDouble();

        System.out.print("Enter mark for Lab Assignment: ");
        labAssignment = input.nextDouble();

        System.out.print("Enter your Final Exam mark: ");
        finalExam = input.nextDouble();

        total = (assessment1 * 0.15)
              + (assessment2 * 0.20)
              + (labAssignment * 0.35)
              + (finalExam * 0.30);

        System.out.printf(
        		("Your total mark for CSC3100 is " + total)
        );

        input.close();
        
	}	

}
