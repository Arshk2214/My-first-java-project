package loopClass;

public class LoopArray {

	int[] numbers = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

	void findNumbersDivisibleByTwo() {
		for (int a = 0; a < 10; a++) {
			int result = numbers[a] % 2;
			{
				if (result == 0) {
					System.out.println("Number that are divisible by 2 =  " + numbers[a]);

				} else if (result != 0) {
					System.out.println("Numbers that are not divisible by 2 = " + numbers[a]);
				}

			}

		}
	}
}
