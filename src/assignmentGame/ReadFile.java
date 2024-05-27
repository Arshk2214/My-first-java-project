package assignmentGame;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadFile {

	private ArrayList<String> listOfNames;

	public void readFileAndStoreInList() {

		try (Scanner sc = new Scanner(Paths.get("C:\\Assignment\\name-list-_1_.txt"))) {

			listOfNames = new ArrayList<String>();

			while (sc.hasNextLine()) {
				listOfNames.add(sc.nextLine());
			}
		}

		catch (InvalidPathException p) {
			p.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String selectRandomName() {

		Random random = new Random();

		int index = random.nextInt(listOfNames.size()); // next int help select random index

		String randomName = listOfNames.get(index); // returns the element at selected index

		return randomName;

	}

}
