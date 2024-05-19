package arrayList;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PersonDetails john = new PersonDetails("John", 20);
		PersonDetails mary = new PersonDetails("Mary", 30);
		PersonDetails sophie = new PersonDetails("Sophie", 25);
		PersonDetails jacob = new PersonDetails("Jacob", 20);
		

		List<PersonDetails> details = new ArrayList<PersonDetails>();
		details.add(sophie);
		details.add(jacob);
		details.add(mary);
		details.add(john);
		details.add(john);

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter name ");
		String name = sc.next();
		boolean isPersonInTheList = false;
	
		for (PersonDetails person: details) {
			if (person.getName().equals(name)) {

				System.out.println(" Person is in the list");
				isPersonInTheList = true;
				break;
			}

		}
		if (!isPersonInTheList) {

			System.out.println(" Person not in the list");
			
		}
  
		sc.close();

	}

}
