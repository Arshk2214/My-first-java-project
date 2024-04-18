package gymMember;

public class SortClients {
	String clientName;
	String dateOfBirth;
	String membershipNumber;
	double height;

	public String getClientName() {

		return clientName;
	}

	public String getDateOfBirth() {

		return dateOfBirth;

	}

	public double getHeight() {

		return height;

	}

	public boolean sortMembership(String numberEntered) {

		if (membershipNumber.equals(numberEntered)) {
			return true;

		}

		return false;

	}

	public SortClients checkMembershipNumber(String numberEntered, SortClients[] client) {

		for (int i = 0; i < client.length; i++) {
			if (client[i].membershipNumber.equals(numberEntered)) {
				return client[i];

			}
			System.out.println(" not valid entry ");
			return client[i];
		}
		return null;

	}

	public void displayName() {
      
		System.out.println(" Name is " + getClientName());
		System.out.println(" Date of Birth  is " + getDateOfBirth());
		System.out.println(" Height  is " + getHeight());

	}

}
