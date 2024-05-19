package assignmentMay;

public abstract class PersonalClass {
//Attributes: name, age, gender
//	Constructor to initialize all attributes.
//	Abstract method describeRole() that subclasses will implement to describe 
	// whether the person is a teacher or student
	private String name;
	private int age;
	private String gender;

	public PersonalClass(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public abstract void describeRole();

}
