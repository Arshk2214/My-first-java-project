package atmAssignment;

import java.util.Scanner;
/*Write a program which takes username and password from user via console and compares it
 *  with a user name and password saved in your class. 
Saved user id and password are as below
UserId	pivotAdmin
password	Admin123
 If the username and password entered by user matches with the one saved in your class, 
 then print “You are logged in to the application“ other wise  print “Incorrect User id or
  password.Try again”.  Also a user gets 3 chances enter the correct user name and password.
   If the user enters incorrect user name or password more than 3 times then print “ Account locked”*/

public class AtmLogin {
	Scanner sc = new Scanner(System.in);
	String userId = "pivotAdmin";
	String password = "Admin123";
	String enterPin;
	String enterUserName;

	void enterYourPin() {
		System.out.println(" Please enter your Username ");
		enterUserName = sc.next();
		System.out.println(" Please enter Your Password ");
		enterPin = sc.next();
		if (enterUserName.equals(userId) && enterPin.equals(password)) {
			System.out.println(" You are logged in");

		}

		else {
			for (int i = 1; i <= 2; i++) {
				System.out.println(" Invalid username or Password .Try again.");
				System.out.println(" Please enter your Username ");
				enterUserName = sc.next();
				System.out.println(" Please enter Your Password ");
				enterPin = sc.next();
				if (enterUserName.equals(userId) && enterPin.equals(password)) {
					System.out.println(" You are logged in");
					break;
				}

				if (i == 2) {
					System.out.println("Account Locked ");
				}
			}

		}
	}
}
