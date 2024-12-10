
public class PAssign10 {

	public static void main(String[] args) {

		Movie movie1 = new Movie("Black Panther", "Action and Adventure", 97.0, 2018);
		System.out.println(movie1.getInfo());
		Movie movie2 = new Movie("Bohemian Rhapsody", "Drama", 60.0, 2018);
		System.out.println(movie2.getInfo());
		Movie movie3 = new Movie("The Incredibles", "Animation", 97.0, 2004);
		System.out.println(movie3.getInfo());
		Movie movie4 = new Movie("Toy Story", "Animation", 100.0, 1995);
		System.out.println(movie4.getInfo());
		Movie movie5 = new Movie("Venom", "Action and Adventure", 29.0, 2018);
		System.out.println(movie5.getInfo());
		Movie movie6 = new Movie("Ratatouille", "Animation", 96.0, 2007);
		System.out.println(movie6.getInfo());

	} // end of main method
} // end of PAssign10 class

// Movie class
class Movie {

	// Create data members
	String title;
	String genre;
	int releaseYear;
	double rating;

	// Default no args constructor
	public Movie() {

		// Set default values with mutator
		setTitle("Untitled");
		setGenre("Drama");
		setReleaseYear(2018);
		setRating(0.0);
	}

	// Convience constructor required
	public Movie(String newTitle) {

		setTitle(newTitle);
	}

	// Convince constructor that's slay
	public Movie(String newTitle, String newGenre, double newRating, int newReleaseYear) {

		setTitle(newTitle);
		setGenre(newGenre);
		setReleaseYear(newReleaseYear);
		setRating(newRating);
	}

	// Method to return the category of the rating
	public String getRatingCategory(double rating) {

		/*
		 * Switch statement casted to an integer and divided by 10 to extract the first
		 * digit. Utilizes fall through behavior to return the rating category that the
		 * rating belongs to. **Need to change default value.**
		 */
		if (rating <= 100.0) {
			switch ((int) rating / 10) {
			case 10:
			case 9:
				return "Excellent";
			case 8:
				return "Above Average";
			case 7:
				return "Average";
			case 6:
				return "Below Average";
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				return "Poor";
			default:
				return "L Bozo.";
			}
		}
	}

	// Returns a formatted String with all information
	public String getInfo() {
		return String.format("%s (%d), %s, Rating: %s"
				, title, releaseYear, genre, getRatingCategory(rating));
	}

	// Title mutator
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	// Title accessor
	public String getTitle() {
		return title;
	}

	// Genre mutator
	public void setGenre(String newGenre) {
		genre = newGenre;
	}

	// Genre accessor
	public String getGenre() {
		return genre;
	}

	// Release year mutator
	public void setReleaseYear(int newReleaseYear) {
		releaseYear = newReleaseYear;
	}

	// Release year accessor
	public int getReleaseYear() {
		return releaseYear;
	}

	// Rating mutator
	public void setRating(double newRating) {
		rating = newRating;
	}

	// Rating accessor
	public double getRating() {
		return rating;
	}
}
