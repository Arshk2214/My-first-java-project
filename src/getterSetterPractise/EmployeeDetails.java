package getterSetterPractise;

public class EmployeeDetails {

	private String employeeName;
	private int employeeId;
	private String employeeDepartment;
	private String username;
	private String password;

	public EmployeeDetails(String employeeName, int employeeId, String employeeDepartment, String username,
			String password) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
		this.username = username;
		this.password = password;

	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public boolean isUsernamePasswordCorrect(String userId, String passcode) {
		if (userId.equals(username) && passcode.equals(password)) {
			return true;
		}
		return false;

	}

	public void setPassword(String userId, String passcode, String newPassword) {
		if (isUsernamePasswordCorrect(userId, passcode)) {
			if (newPassword == null || newPassword.length() < 2) {
				System.out.println("Please enter valid password");

			} else {
				this.password = newPassword;

				System.out.println(" New password is saved " + password.replaceAll(password, "*****"));
			}
		}

		else {
			System.out.println(" Incorrect username or password");
		}
	}

}
