
public class User {

	private String name;
	private String[] pronouns = new String[2];
	private String background;
	private int reputation;
	private int[] statValue;
	private String[] statNames;
	private int stars;
	private int currency;
	private String[] ingredientsNames;
	private int [] ingredientsAmount;
	private int recipes;
	private String[] missingRecipes;
	private String stage;
	private int level;
	
	User(String name, String[] pronouns) {
		
		setName(name);
		setPronouns(pronouns);
		setBackground("N/A");
		setReputation(0);
		setStars(0);
		setCurrency(0);
		setStage("Starting");
		setLevel(1);
		setRecipes(0);
	}
	
	public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String[] getPronouns() {
    	return pronouns;
    }
    
    private void setPronouns(String[] pronouns) {
    	this.pronouns = pronouns;
    }
    public String getBackground() {
        return background;
    }

    private void setBackground(String background) {
        this.background = background;
    }


    public int getReputation() {
        return reputation;
    }

    private void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int[] getStatValue() {
        return statValue;
    }

    private void setStatValue(int[] statValue) {
        this.statValue = statValue;
    }

    public String[] getStatNames() {
        return statNames;
    }

    private void setStatNames(String[] statNames) {
        this.statNames = statNames;
    }

    public int getStars() {
        return stars;
    }

    private void setStars(int stars) {
        this.stars = stars;
    }

    public int getCurrency() {
        return currency;
    }

    private void setCurrency(int currency) {
        this.currency = currency;
    }

    public String[] getIngredientsNames() {
        return ingredientsNames;
    }

    private void setIngredients(String[] ingredientsNames) {
        this.ingredientsNames = ingredientsNames;
    }
    
    private int[] getIngredientsAmount() {
    	return ingredientsAmount;
    }
    
    private void setIngresientsAmount(int[] ingredientsAmount) {
    	this.ingredientsAmount = ingredientsAmount;
    }

    public int getRecipes() {
        return recipes;
    }

    void setRecipes(int recipes) {
        this.recipes = recipes;
    }

    public String[] getMissingRecipes() {
        return missingRecipes;
    }

    private void setMissingRecipes(String[] missingRecipes) {
        this.missingRecipes = missingRecipes;
    }

    public String getStage() {
        return stage;
    }

    private void setStage(String stage) {
        this.stage = stage;
    }

    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }
}
