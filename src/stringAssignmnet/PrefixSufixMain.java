package stringAssignmnet;

public class PrefixSufixMain {
	public static void main(String[] args) {
		PrefixSuffix ps = new PrefixSuffix();

		ps.displayResult("automation", "auto-");
		ps.displayResult("retrospect", "sub-");
		ps.displayResultOne("arachnophobia", "-phobia");
		ps.displayResultOne("vocation", "-logy");
	}
}
