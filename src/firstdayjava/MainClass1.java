package firstdayjava;

public class MainClass1 {
public static void main(String[] args) {
		
		MathClass simple=new MathClass();
		simple.result();
		simple.result2();
		
		int principal1=simple.principal;
		System.out.println(principal1);
		
		double interest=simple.rateOfInterest;
		System.out.println(interest);
		
	}

}
