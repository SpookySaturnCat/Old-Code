
public class Lab04Prob01 {

	public static void main(String[] args) {
		
		int randomAge = (int) ((Math.random() * 65) + 1);
		String eligibility = " ";
		
		if (randomAge < 21) {
			eligibility = " not ";
		}
		
		System.out.printf("You are %d years old and are%seligible to purchase alcohal.", randomAge, eligibility);
	}
}
