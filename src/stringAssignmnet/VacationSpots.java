package stringAssignmnet;

public class VacationSpots {

	public String grabCity(String touristAttractions) {

		int position = touristAttractions.lastIndexOf("[");
		String city = touristAttractions.substring(position + 1, touristAttractions.length() - 1);
		return city;

	}

}
