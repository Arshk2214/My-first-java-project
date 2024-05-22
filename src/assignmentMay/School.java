package assignmentMay;

import java.util.ArrayList;
import java.util.LinkedList;

public class School {
	static String name = "D.A.V";
	private ArrayList<Teacher> listOfteachers = new ArrayList<Teacher>();
	private LinkedList<Student> listOfstudents = new LinkedList<Student>();

	public String getName() {
		return name;
	}

	public ArrayList<Teacher> getListOfteachers() {
		return listOfteachers;
	}

	public void setListOfteachers(ArrayList<Teacher> listOfteachers) {
		this.listOfteachers = listOfteachers;
	}

	public LinkedList<Student> getListOfstudents() {
		return listOfstudents;
	}

	public void setListOfstudents(LinkedList<Student> listOfstudents) {
		this.listOfstudents = listOfstudents;
	}

	public void addStudent(Student student) {
		listOfstudents.add(student);
	}

	public void addTeacher() {

		LinkedList<Integer> listOfRatings = new LinkedList<Integer>();
		String[] courses = { "Physics, Mathematics, Biology, Chemistry, Economics, Business, History, Literature" };
		listOfteachers.add(new Teacher("John Adams", 40, "male", "E001", 50000, courses, listOfRatings));
		listOfteachers.add(new Teacher("Keisha johnson", 30, "Female", "E002", 50000, courses, listOfRatings));
		listOfteachers.add(new Teacher("Mike brown", 50, "male", "E003", 50000, courses, listOfRatings));
		listOfteachers.add(new Teacher("John mathew", 30, "male", "E004", 50000, courses, listOfRatings));

	}

	public void updateRating(String teacherName, int rating) {
		boolean teacherExists = false;
		 
		for (Teacher teacher : listOfteachers) {
			if (teacherName.equalsIgnoreCase(teacher.getName())) {
				teacher.addRating(rating);
				double newRating = teacher.calculateAverageRating();
				teacherExists = true;
				System.out.println("Updated Teacher Rating");
				System.out.println("Teacher: " + teacherName);
				System.out.println("New Average rating: " + newRating);
				break;
			}
		}

		if (!teacherExists) {

			System.out.println(" Please enter valid name");
			
		}

	}
}
