package assignmentOopsPartTwo;

public class AtmTwo extends BankOperationsTwo {
	private String pin;

	public AtmTwo(String pin) {
		super();
		this.pin = pin;
	}

	public boolean isPinValid(String enteredPin) {
		if (pin.equals(enteredPin)) {
			return true;
		}
		return false;
	}

	@Override
	public void changePinPassword(String enteredPin,String newPin) {

		if (isPinValid(enteredPin)) {
			if (newPin.equals(pin) || newPin.length() < 4) {
				System.out.println(" Pin can not be same as old pin and pin digits need to be atleast four");
			} else {
				pin = newPin;
				System.out.println(" Pin changed sucessfully ");
			}
		} else {
			System.out.println("Invalid credentials");
		}

	}

}
