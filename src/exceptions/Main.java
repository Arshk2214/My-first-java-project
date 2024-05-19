package exceptions;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		NulPointerException ex = new NulPointerException();
		// ex.changeName();

		
			try {
				ex.name("ar");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		

	}

}
