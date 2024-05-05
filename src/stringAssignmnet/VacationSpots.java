package stringAssignmnet;

public class VacationSpots {

	public String grabCity(String touristAttractions) {
		/*
		 * Write a function to return the city from each of these vacation spots. As
		 * shown in example below index of search word ‘Pineapple’ is 0 Examples
		 * grabCity("[Last Day!] Beer Festival [Munich]") ➞ "Munich"
		 * grabCity("Cheese Factory Tour [Portland]") ➞ "Portland"
		 * grabCity("[50% Off!][Group Tours Included] 5-Day Trip to Onsen [Kyoto]") ➞
		 * "Kyoto"
		 * 
		 * 
		 */

		int position = touristAttractions.lastIndexOf("[");
		String city = touristAttractions.substring(position + 1, touristAttractions.length() - 1);
		return city;

	}

}
