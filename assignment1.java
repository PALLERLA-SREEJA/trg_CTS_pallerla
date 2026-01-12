package assignment1;
import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student ID");
		int studentId=sc.nextInt();
		
		System.out.println("Enter student name");
		String studentName=sc.next();
		
		System.out.println("Enter marks (0 to 100)");
		int marks=sc.nextInt();		
		
		System.out.println("Fee Paid Status (Yes/No or True/False)");
		boolean feePaid=sc.nextBoolean();
		
		String result;
		
		
	
		if(marks>=40) {
			result="Student Passed";
		}
		else {
			result="Student Failed";
	
		}
		char grade;
		
		if(marks>=85) {
			grade='A';
			
		}
		else if(marks>70 && marks<=84) {
			grade='B';
			
		}
		else if(marks>=50 && marks<=69) {
			grade='C';
		}
		
		else {
			grade='D';
		}
		String certificate;
		if(marks>=40 && feePaid==true) {
			certificate="Eligible for certificates";
		}
		else{
			certificate="Not eligible";
		}
		
	
	
		String course;
		switch(grade) {
		case 'A': course="Data Science";
		break;
		case 'B':course="Java Full Stack";
		break;
		case 'C': course="Web Development";
		break;
		case 'D': course="Basic Programming";
		break;
		default: course="Counselling";
		
		
		}
		
		System.out.println("StudentId= "+studentId+"  "+"Student Name= " + " " +studentName);
		System.out.println("Marks= "+marks+"   "+"Result= "+" "+result);
		System.out.println("Grade= "+grade);
		System.out.println("FeePaid= "+feePaid);
		System.out.println("Certificate= "+certificate);
		System.out.println("Course Allocated= "+course);
		
		
		
	}

}