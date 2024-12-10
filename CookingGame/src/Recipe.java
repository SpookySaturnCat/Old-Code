import java.io.File;

public class Recipe {

	private String name;
	private String type;
	private String[] ingredients;
	private int hp;
	private int dp;
	private int dfsp;
	
	Recipe() {
		
		File cookbook = new File("src/Cookbook.txt");
		
		setName("Big Walk Dog Burger");
		setType("Damage");
		String[] temp = Utilities.fileToStringArray(cookbook, "Big Walk Dog Burger");
		setIngredients(temp);
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	private void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}
	
	public String[] getIngredients() {
		return ingredients;
	}
}
