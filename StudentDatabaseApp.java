/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 05, 2024
 * */
package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask how many new students we want to add
		System.out.print("Enter the number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		
		// Create n number of students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			System.out.println(students[n].showCourseAvailability());
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
		

	}

}
