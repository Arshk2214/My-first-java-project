package assignmentMay;

import java.util.LinkedList;

public class Teacher extends PersonalClass {

	@Override
	public String describeRole() {
		return "teacher";

	}

	private String EmployeeId;
	private int salary;
	String[] courses = new String[10];

	LinkedList<Integer> listOfRatings = new LinkedList<Integer>();

	public String getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LinkedList<Integer> getListOfRatings() {
		return listOfRatings;
	}

	public void setListOfRatings(LinkedList<Integer> listOfRatings) {
		this.listOfRatings = listOfRatings;
	}

	public Teacher(String name, int age, String gender, String employeeId, int salary, String[] courses,
			LinkedList<Integer> listOfRatings) {
		super(name, age, gender);
		EmployeeId = employeeId;
		this.salary = salary;
		this.courses = courses;
		this.listOfRatings = listOfRatings;
	}

	public void addRating(int rating) {
		listOfRatings.add(rating);
	}

	public double calculateAverageRating() {
		int sum = 0;
		for (int rating : listOfRatings) {
			sum += rating;
		}
		double average = (sum) / listOfRatings.size();
		return average;
	}

}
