package gymMember;

import java.util.Scanner;

public class SortClientsMain {
	public static void main(String[] args) {

		SortClients clientOne = new SortClients();
		clientOne.clientName = "John Adams";
		clientOne.dateOfBirth = "15 August 1990";
		clientOne.membershipNumber = "123456";
		clientOne.height = 182.88;

		SortClients clientTwo = new SortClients();
		clientTwo.clientName = "Keisha Wren";
		clientTwo.dateOfBirth = "15 july 1996";
		clientTwo.membershipNumber = "098765";
		clientTwo.height = 162.56;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your membership number");
		String numberEntered = sc.next();

		SortClients[] client = { clientOne, clientTwo };

		SortClients sci = new SortClients();
		sci = sci.checkMembershipNumber(numberEntered, client);
		sci.displayName();
	}
}
