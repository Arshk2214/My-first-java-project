package assignmentMay;

import java.util.ArrayList;

public class Teacher extends PersonalClass {

	@Override
	public void describeRole() {
		System.out.println(" Person is Teacher");

	}

	private String EmployeeId;
	private int salary;
	String[] courses = new String[10];

	ArrayList<Integer> listOfRatings = new ArrayList<Integer>();

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

	public ArrayList<Integer> getListOfRatings() {
		return listOfRatings;
	}

	public void setListOfRatings(ArrayList<Integer> listOfRatings) {
		this.listOfRatings = listOfRatings;
	}

	public Teacher(String name, int age, String gender, String employeeId, int salary, String[] courses, ArrayList<Integer> listOfRatings
			) {
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
