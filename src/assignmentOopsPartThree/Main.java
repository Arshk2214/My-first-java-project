package assignmentOopsPartThree;

import java.util.Scanner;



public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	AtmThree john = new AtmThree(1234);
	OnlineBankingThree johnOnline = new OnlineBankingThree("John1234");
	System.out.println(" Which operation would you like to choose today ?");
	String operation = sc.next();
	if(operation.equals("Atm")) {
		System.out.println(" Please enter pin ");
		int enteredPIn=sc.nextInt();
		if(john.isPinValid(enteredPIn)) {
			boolean continueBanking=true;
		while(continueBanking) {
			System.out.println(" Plese press 1 for withdraw ,2 for Deposit,3 for exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				john.withdrawFunds();
				john.getBalance();
				if(john.getBalance()>=1000) {
					System.out.println(" Daily withdraw limit reached.");
				
				
					return;
				}
				
				break;
			case 2:	
                john.depositFunds();
                john.getBalance();
                break;
			case 3:
				continueBanking=false;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
		System.out.println(" Thankyou for choosing our bank.");
		}
		
		}
	}
	
	
}
