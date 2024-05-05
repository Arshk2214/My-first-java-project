package assignmentOopsPartTwo;

public class OnlineBankingTwo extends BankOperationsTwo {
	private String password;

	public OnlineBankingTwo(String password) {
		super();
		this.password = password;
	}

	public boolean isPasswordValid(String enteredPassword) {
		if (password.equals(enteredPassword)) {
			return true;
		}
		return false;
	}

	@Override
	public void changePinPassword(String enteredPassword, String newPassword) {
		if (isPasswordValid(enteredPassword)) {
			if (newPassword.equals(password) || newPassword.length() > 8 || newPassword.contains("&")
					|| newPassword.contains("$") || newPassword.contains("@")) {
				System.out.println(
						" Password can not be same as old password and password can't have less than 8 characters and  these special characters (&,$, @)");
			} else {
				password = newPassword;
				System.out.println(" Password changed ");
			}
		} else {
			System.out.println("Invalid credentials");
		}

	}

}
