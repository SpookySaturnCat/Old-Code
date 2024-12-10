package coffeeshop;

public class Person {
	// Data members
	private String name = "";
	private int age;
	private Drink favoriteDrink;
	
	// Default no-args constructor
	public Person() {
		setName("Stu Macher");
		setAge(18);
		setFavoriteDrink(new Drink());
	}
	
	// Convenience constructor
	public Person(String name, int age) {
		this();
		setName(name);
		setAge(age);
	}
	
	public Person(String name, int age, Drink favoriteDrink) {
		this(name, age);
		setFavoriteDrink(favoriteDrink);
	}
	
	public String toString() {
		return String.format("Name: %s\nAge: %d\nFavorite drink:\n%s", getName(), getAge(), getFavoriteDrink());
	}
	// Acsessors and mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Drink getFavoriteDrink() {
		return favoriteDrink;
	}

	public void setFavoriteDrink(Drink favoriteDrink) {
		this.favoriteDrink = favoriteDrink;
	}
	
}
