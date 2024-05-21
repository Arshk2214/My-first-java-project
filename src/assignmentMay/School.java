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

	public void addTeacher(Teacher teacher) {

		listOfteachers.add(teacher);

	}

	double newRating;

	public void updateRating(String teacherName, int rating) {
		boolean teacherExists = false;

		for (Teacher teacher : listOfteachers) {
			if (teacherName.equals(teacher.getName())) {
				teacher.addRating(rating);
				newRating = teacher.calculateAverageRating();
				teacherExists = true;
				System.out.println("Updated Teacher Rating");
				System.out.println("Teacher: " + teacherName);
				System.out.println("New Average rating: " + newRating);
				break;
			}
		}

		if (!teacherExists) {
			LinkedList<Integer> listOfRatings = new LinkedList<Integer>();
			String[] courses = { "Physics, Mathematics, Biology, Chemistry, Economics, Business, History, Literature" };
			Teacher newTeacher = new Teacher(teacherName, 40, "Female", "E001", 50000, courses, listOfRatings);
			newTeacher.addRating(rating);
			listOfteachers.add(newTeacher);

			System.out.println("______Updated Teacher Rating_____");
			System.out.println("Teacher: " + teacherName);
			System.out.println("New Average rating: " + newTeacher.calculateAverageRating());
		}

	}
}
