package getterSetterPractise;

public class EmployeeDetailsMain {
	public static void main(String[] args) {
		EmployeeDetails johnFile = new EmployeeDetails("John Adams", 1234, "Human Resources", "John12", "Jo1234");
		System.out.println(johnFile.getEmployeeName());
		johnFile.setPassword("John12", "Jo1234", "78999");
      
	}

}
