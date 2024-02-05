package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	// This constructor I don't add any parameter because we will ask the user to enter the student info later
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - for Freshman\n2 - for Sophomore\n3 - for Junior\n4 - for Senior\nEnter student's class level: ");
		this.gradeYear = in.nextInt();
		
		
		setStudentID();
		
			
	}
	
	// Generate an ID
	private void setStudentID() {
		//I increment id because every time the user enter a complete student information, the id will increment by 1, 
		//so we have unique id for each student
		id++;
		// grade level + id
		this.studentID = gradeYear + "" + id;
		
	}
	
	//show Course Availability for each grade level year
	public String showCourseAvailability() {
		System.out.println("Students in this level " + gradeYear + " can enroll the following courses: ");
		if (gradeYear == 1) {
			return "  History101\n  English102\n  Maths103\n  Chemistry104\n  Physics105\n  Literature106";
		}
		else if (gradeYear == 2) {
			return "  History201\n  English202\n  Maths203\n  Chemistry204\n  Physics205\n  Literature206";
		}
		else if (gradeYear == 3) {
			return "  History301\n  English302\n  Maths303\n  Chemistry304\n  Physics305\n  Literature306";
		}
		else if (gradeYear == 4) {
			return "  History401\n  English402\n  Maths403\n  Chemistry404\n  Physics405\n  Literature406";
		}
		else {
			return "Invalid Grade Level Year!";
		}
	}
	
	// Enroll in courses 
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += costOfCourse;
			}
			else {break;}
		}while(1 != 0);
		
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your tuition balance is: $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		//Ask the user how much they want to pay
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = in.nextInt();
		
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear + 
				"\nStudent ID: " + studentID +
				"\nCourses enrolled: " + courses +
				"\nBalance: $" + tuitionBalance + "\n";
	}

}
