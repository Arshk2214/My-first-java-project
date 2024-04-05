package operatorsJava;

public class FindLargestNumber {
	int a=50;
	int b=49;
	int c=68;
	
	void findLargestNumber() {
		
		if ((a>b)&&(a>c)) {
			System.out.println("a is the largest number");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is the largest number");
		}
		else if((c>a)&&(c>b)) {
			System.out.println("c is the largest number");
		}
		
	}
	

}
