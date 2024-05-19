package assignmentMay;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		School school = new School();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!");

		System.out.print("Please enter the student's name: ");
		String studentName = sc.next();
		System.out.print("Please enter the student's age: ");
		int studentAge = sc.nextInt();
		System.out.print("Please enter the student's gender: ");
		String studentGender = sc.next();
		System.out.println(" Enter student Id ");
		String studentId = sc.next();
		System.out.println(" Please enter the student's academic percentage");
		double studentPercentage = sc.nextDouble();
		Student student = new Student(studentName, studentAge, studentGender, studentId, studentPercentage);

		if (studentPercentage >= 49.99) {

			System.out.println(" Stream allocation result ");
			System.out.printf(" Name: " + studentName + " Age: " + studentAge +" Gender: " + studentGender+
					" Academic Percentage: " + studentPercentage);
			sc.nextLine();
			student.determineStream();
			System.out.println("Please enter the teacher's name you wish to rate");
			String teacherName = sc.next();
			school.addTeacher(teacherName);
			System.out.println("Please enter your rating for " + teacherName + " (1-5)");
			int rating = sc.nextInt();
			Teacher teacher = new Teacher(teacherName, 40, "Female", "E001",50000, "Physics, Mathematics,Biology,Chemistry,Economics, Business,History, Literature");
			if (rating >= 0 && rating <= 5) {

				student.rateTeacher(teacher, rating);
			} else {
				System.out.println(" Invalid entry .Please enter again.");
				rating = sc.nextInt();

			}

			System.out.println(" Updated Teacher Rating");
			System.out.println("Teacher: " + teacherName);

			System.out.println(" New Average rating " + teacher.calculateAverageRating());

		} else {
			System.out.println(" Student must have 50% to be eligible");

		}
		sc.close();
	}
}
