
public class Scratch {

	public static void main(String[] args) {
	Movie movie = new Movie();
	
	String category = movie.getRatingCategory(100.1);
	System.out.println(category);
	}
}
