package assignmentMay;

import java.util.ArrayList;
import java.util.LinkedList;

public class School {
	private String name;
	private ArrayList<String> listOfteachers = new ArrayList<String>();
	private LinkedList<String> listOfstudents = new LinkedList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getListOfteachers() {
		return listOfteachers;
	}

	public void setListOfteachers(ArrayList<String> listOfteachers) {
		this.listOfteachers = listOfteachers;
	}

	public LinkedList<String> getListOfstudents() {
		return listOfstudents;
	}

	public void setListOfstudents(LinkedList<String> listOfstudents) {
		this.listOfstudents = listOfstudents;
	}

	public void addStudent(String studentName) {
		listOfstudents.add(studentName);
	}

	public void addTeacher(String teacherName) {

		listOfteachers.add(teacherName);
	}

}
