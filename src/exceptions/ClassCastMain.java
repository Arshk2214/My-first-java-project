package exceptions;

public class ClassCastMain {

	public static void main(String[] args) {
		/*
		 * class cast happens when object of one class is casted with another class that
		 * does not have appropriate inheritance relation
		 */
		JobFair interview = new ItDepartment();

		ItDepartment a = (ItDepartment) interview; // Downcasting jobfair to Itdepartment ,done explicitly
		// This will work

		HrDepartment b = (HrDepartment) interview;
		// This will give Exception

		ItDepartment interviewTwo = new ItConsultant();
		ItConsultant c = (ItConsultant) interviewTwo; // Downcasting
		// This will work interviewTwo refers to ItConsultant
	}

}
