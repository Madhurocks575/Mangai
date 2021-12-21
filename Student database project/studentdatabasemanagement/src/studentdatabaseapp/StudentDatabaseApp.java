package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofStudents = in.nextInt();
		Student[] students = new Student[numofStudents];

		// Create 1 number of new students
		for (int n= 0; n < numofStudents; n++) {
		    students[n] = new Student();
            students[n].enroll();
	        students[n].payTuition(n);
		}
		
	        

		for (int n = 0; n < numofStudents; n++) {
		    System.out.println(students[n].toString());
		}
	}
}

	


 