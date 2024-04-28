package arrayPractise;

import java.util.Scanner;

public class FindLargestNumber {

	int[] numbers = { 10, 20, 80, 45, 60 };
	int largestNumber = numbers[2];
	Scanner sc = new Scanner(System.in);

	void findNumber() {
		System.out.println(" Enter the number ");
		int enterNumber = sc.nextInt();
         boolean isNumberPresent=false;
		for (int i = 0; i < numbers.length;i++) {
			
			if (enterNumber == numbers[i]) {
				System.out.println(" Number present in the list");
				isNumberPresent=true;
				break;
			}
		}
		if(!isNumberPresent)	{
			System.out.println(" Number not in the system");
		}
		}

	void findLargestNumber() {
		for (int i = 0; i <= numbers.length; i++) {

			if (numbers[i] >= largestNumber) {

				System.out.println(" The largest number is " + numbers[i]);
				break;
			}

		}
	}
}
