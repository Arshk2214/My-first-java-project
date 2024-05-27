package assignmentGame;

public class Main {
	public static void main(String[] args) {

		ReadFile readFile = new ReadFile();

		readFile.readFileAndStoreInList();

		FinalApplication fa = new FinalApplication();

		fa.gameApplication(readFile);
	}
}
