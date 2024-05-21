package assignmentMay;

import java.util.Scanner;

public class Student extends PersonalClass {
	/*
	 * Additional attributes: studentID, percentage (academic performance).
	 * Constructor to initialize all attributes including percentage. Methods:
	 * determineStream(): Determines and returns the educational stream based on
	 * the percentage: 85% or more: Non-medical (e.g., Physics, Mathematics) 75%
	 * to 84.99%: Medical (e.g., Biology, Chemistry) 65% to 74.99%: Commerce (e.g.,
	 * Economics, Business Studies) Below 65%: Arts (e.g., History, Literature)
	 * rateTeacher(Teacher teacher, int rating): Allows a student to rate a teacher
	 * on a scale of 1 to 5.
	 */
	Scanner sc = new Scanner(System.in);
	private String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	private Double percentage;

	public Student(String name, int age, String gender, String studentId, Double percentage) {
		super(name, age, gender);
		this.studentId = studentId;
		this.percentage = percentage;
	}

	@Override
	public String describeRole() {
		return "student";

	}

	public final void determineStream() {

		if (percentage >= 85) {
			System.out.println("Allocated stream is Non-Medical ");
			System.out.println(getName() + " can enroll in courses like  Physics, Mathematics");
		}

		if (percentage >= 75 && percentage <= 84.99) {
			System.out.println(" Allocated stream is Medical ");
			System.out.println(getName() + " can enroll in courses like  Biology, Chemistry");
		}
		if (percentage >= 65 && percentage <= 74.99) {
			System.out.println(" Allocated stream is Commerce " + getName());
			System.out.println(getName() + " can enroll in courses like  Economics, Business Studie");
		}

		if (percentage < 65) {
			System.out.println(" Allocated stream is Arts ");
			System.out.println(getName() + " can enroll in courses like  History, Literature");
		}

	}

	public int rateTeacher(Teacher teacher, int rating) {
		teacher.addRating(rating);
		return rating;
	}

}
