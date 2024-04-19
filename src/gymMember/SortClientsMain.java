package gymMember;

import java.util.Scanner;

public class SortClientsMain {
	public static void main(String[] args) {

		SortClients clientOne = new SortClients("John Adams", "15 August 1990", "123456", 182.88);

		SortClients clientTwo = new SortClients("Keisha Wren", "15 july 1996", "098765", 162.56);

		SortClients clientThree = new SortClients("Kevin paul", "15 july 1990", "56578", 180.09);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your membership number");
		String numberEntered = sc.next();

		SortClients[] client = { clientOne, clientTwo, clientThree };

		SortClients sci = new SortClients("", "", "", 0.0);

		sci = sci.checkMembershipNumber(numberEntered, client);

		sci.displayName();

		sc.close();
	}

}
