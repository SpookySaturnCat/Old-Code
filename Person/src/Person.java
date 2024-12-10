
public class Person {

	private int birthYear;
	private String name;
	private String address;
	
	// default no-arg constructor
	public Person() {
		birthYear = 2000;
		name = "Jane Doe";
		address = "123 Main St.";
	}
	
	public void eat ()
 {
		
 }
	public void sleep() {
		
	}
	
	public int getAge() {
		return 2023 - birthYear;
	}
	
	public String getInfo() {
		return String.format("%d %s %s", birthYear, name, address);
	}
}
