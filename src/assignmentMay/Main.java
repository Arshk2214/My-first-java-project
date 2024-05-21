package assignmentMay;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		School school = new School();
		Scanner sc = new Scanner(System.in);
		boolean numberOfStudent = true;
		while (numberOfStudent) {
			System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!");

			System.out.print("Please enter the student's name: ");
			String studentName = sc.nextLine();
			System.out.print("Please enter the student's age: ");
			int studentAge = sc.nextInt();
			System.out.print("Please enter the student's gender: ");
			String studentGender = sc.next();
			System.out.println("Enter student Id:");
			String studentId = sc.next();
			System.out.println("Please enter the student's academic percentage:");
			double studentPercentage = sc.nextDouble();
			Student student = new Student(studentName, studentAge, studentGender, studentId, studentPercentage);
			school.addStudent(student);
			if (studentPercentage >= 49.99 && studentAge >= 16 && !studentName.isEmpty()) {

				System.out.println("______ Stream allocation result_____ ");
				System.out.println("Name: " + studentName + " \nAge: " + studentAge + " \nGender: " + studentGender
						+ " \nAcademic Percentage: " + studentPercentage);
				sc.nextLine();
				student.determineStream();
				do {
					System.out.println("Please enter the teacher's name you wish to rate:");
					String teacherName = sc.nextLine();

					System.out.println("Please enter your rating for " + teacherName + " (1-5):");
					int rating = sc.nextInt();

					if (rating >= 0 && rating <= 5 && !teacherName.isEmpty()) {

						school.updateRating(teacherName, rating);
						break;
					} else {
						System.out.println(" Invalid entry .Please enter again.");

					}
				} while (true);

			} else {
				System.out.println(
						" Student must have 50% to be eligible , age must be over 16 ,Please dont leave blank spaces");

			}
		}

		sc.close();
	}
}
