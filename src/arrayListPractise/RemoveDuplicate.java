package arrayListPractise;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Jerin", "Annena", "Ravneet", "Emil", "Emil" };

		List<String> namesList = new ArrayList<String>();

		namesList.addAll(Arrays.asList(names));

		System.out.println("Names in the list :" + namesList);

		// namesList.remove(4);
		// System.out.println(" After removing duplicate "+namesList.toString());
		List<String> uniqueNames = new ArrayList<>();
		for (String name : namesList) {
			if (!uniqueNames.contains(name)) {
				uniqueNames.add(name);
			}
		}
		namesList = uniqueNames;
		System.out.println(" After removing duplicate " + namesList);

	}
}
