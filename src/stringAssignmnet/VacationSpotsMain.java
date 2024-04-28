package stringAssignmnet;

public class VacationSpotsMain {

	public static void main(String[] args) {
		VacationSpots vs = new VacationSpots();
		System.out.println(vs.grabCity("[Last Day!] Beer Festival [Munich]"));
		System.out.println(vs.grabCity("Cheese Factory Tour [Portland]"));
		System.out.println(vs.grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]"));
	}
}
