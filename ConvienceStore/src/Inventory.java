
public class Inventory {

	public String currentItem;
	public String[] chipName = { "Takis", "Pringles", "Kettle Chips", "Doritos" };
	public double[] chipPrice = { 3.30, 2.50, 4.00, 2.75 };
	public int[] chipStock = { 6, 8, 4, 9 };
	public String[] drinkName = { "Coke", "Orange Juice", "Water", "Diet Coke" };
	public double[] drinkPrice = { 2.59, 3.40, 1.50, 2.59 };
	public int[] drinkStock = { 20, 5, 9, 13 };
	public String[] candyName = { "Take Five", "Kit Kat", "Sour Patch Kids", "Nerd Rope" };
	public double[] candyPrice = { 1.75, 2.00, 3.00, 1.55 };
	public int[] candyStock = { 12, 8, 6, 15 };


	public Inventory() {
		
		setCurrentItem("");
	}
	
	public void setCurrentItem(String newCurrentItem) {
		currentItem = newCurrentItem;
	}
	
	public String getCurrentItem() {
		return currentItem;
	}
	
	public void setChipName(String[] newChipName) {
		chipName = newChipName;
	}
	
	public String[] getChipName() {
		return chipName;
	}
	
	public void setChipPrice(double[] newChipPrice) {
		chipPrice = newChipPrice;
	}
	
	public double[] getChipPrice() {
		return chipPrice;
	}
	
	public void setChipStock(int[] newChipStock) {
		chipStock = newChipStock;
	}
	
	public int[] getChipStock() {
		return chipStock;
	}
	
	public void setDrinkName(String[] newDrinkName) {
		drinkName = newDrinkName;
	}
	
	public String[] getDrinkName() {
		return drinkName;
	}
	
	public void setDrinkPrice(double[] newDrinkPrice) {
		drinkPrice = newDrinkPrice;
	}
	
	public double[] getDrinkPrice() {
		return drinkPrice;
	}
	
	public void setDrinkStock(int[] newDrinkStock) {
		drinkStock = newDrinkStock;
	}
	
	public int[] getDrinkStock() {
		return drinkStock;
	}
	public void setCandyName(String[] newCandyName) {
		candyName = newCandyName;
	}
	
	public String[] getCandyName() {
		return candyName;
	}
	
	public void setCandyPrice(double[] newCandyPrice) {
		candyPrice = newCandyPrice;
	}
	
	public double[] getCandyPrice() {
		return candyPrice;
	}
	
	public void setCandyStock(int[] newCandyStock) {
		candyStock = newCandyStock;
	}
	
	public int[] getCandyStock() {
		return candyStock;
	}
}