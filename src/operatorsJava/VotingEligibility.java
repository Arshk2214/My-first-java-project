package operatorsJava;

public class VotingEligibility {

	int age = 16;
	String outcomeOne = ("You are eligilble");
	String outcomeTwo = ("you are not eligilble");
    boolean result=age>=18;
	void eligibilityCriteria() {
		if (result) {
			System.out.println(outcomeOne);
		} else {
			System.out.println(outcomeTwo);

		}
	}

}
