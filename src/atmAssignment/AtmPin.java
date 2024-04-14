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

public class AtmPin {
	Scanner sc = new Scanner(System.in);
	String userId = "pivotAdmin";
	String password = "Admin123";
	String enterPin;
	String enterUserName;
	String enterUserNameOne;
	boolean isPinCorrect = false;

	int numberOfAttempts = 0;
	int numberOfAttemptss = 0;

	void enterYourPin() {
		System.out.println(" Please enter your Username ");
		enterUserName = sc.next();

		if (enterUserName.equals(userId)) {

			System.out.println(" Please enter Your Password ");
			for (int i = 0; i < 3; i++) {
				enterPin = sc.next();
				if (enterPin.equals(password)) {
					isPinCorrect = true;
					System.out.println(" You are logged into the application ");

					break;
				}
				if (!isPinCorrect) {
					System.out.println(" Incorrect Password ");

					numberOfAttempts = numberOfAttempts + 1;
					if (numberOfAttempts == 3) {
						System.out.println(" Account Locked ");
						break;
					}
					System.out.println("Please enter correct pin ");
				}

			}
		}

		else {
			System.out.println(" Incorrect Username ");

			for (int j = 0; j < 3; j++) {

				numberOfAttempts = numberOfAttempts + 1;
				if (numberOfAttempts == 3) {
					System.out.println(" Account Locked ");
					break;
				}

				System.out.println("Please enter correct Username ");
				enterUserNameOne = sc.next();

				if (enterUserNameOne.equals(userId)) {

					System.out.println(" Please enter Your Password ");

					for (int k = 0; k < 3; k++) {
						enterPin = sc.next();
						if (enterPin.equals(password)) {
							isPinCorrect = true;
							System.out.println(" You are logged into the application ");

							return;

						}

						if (!isPinCorrect) {
							System.out.println(" Incorrect Password ");

							numberOfAttemptss = numberOfAttemptss + 1;
							if (numberOfAttemptss == 3) {
								System.out.println(" Account Locked ");
								return;

							}

							System.out.println("Please enter correct pin ");

						}
					}
				}

			}
		}

	}

}
