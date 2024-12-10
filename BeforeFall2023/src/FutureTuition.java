public class FutureTuition {
	public static void main(String[] args) {
		double tuition = 10000; //year 1 
		int year = 1;
		while(tuition < 20000) {
			tuition = tuition * 1.07;
			//below comments are all other ways to get same result
			//tuition *= 1.07;
			//tuition += tuition * 0.07;
			//tuition = tuition + tuition * 0.07;
			year++;
		}
		System.out.println("Tuition will be doubled in " +
		year + " years.");

	}
}
