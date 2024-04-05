package firstdayjava;

public class MathClass {
	int principal = 12000;

	double rateOfInterest = 1.9;
	int timePeriod = 2;
	double simpleInterestValue;
	double compoundInterest;

	void result() {

		simpleInterestValue = (principal * rateOfInterest * timePeriod) / 100;
		System.out.println("Simple Interest is-" + simpleInterestValue);

	}

	void result2() {
		compoundInterest = principal * (Math.pow((1 + (rateOfInterest / 100)), timePeriod));
		System.out.println("Compound Interest is -" + compoundInterest);

	}

}
