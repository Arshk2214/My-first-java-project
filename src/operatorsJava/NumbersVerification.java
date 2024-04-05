package operatorsJava;

public class NumbersVerification {
	int number = -60;
	int a, b;
	double c;
	double result;

	void numbersVerification() { // to check weather no .is Positive,Negative or Zero

		if (number >= 0) {
			System.out.println("Number is positive");
		}
		if (number <= 0) {
			System.out.println("Number is negative");
		}
		if (number == 0) {
			System.out.println("Number is equal to zero");
		}

	}

	void addNegativeNumbers() { // adding negative numbers
		a = -50;
		b = -55;
		c = -5.5;
		result = a + b + c;
		System.out.println(result);

	}

}