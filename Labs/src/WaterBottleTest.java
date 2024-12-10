
public class WaterBottleTest {
	public static void main(String[] args) {
		//create default water bottle and convenience water bottle
		WaterBottle bottle1 = new WaterBottle();
		WaterBottle bottle2 = new WaterBottle(9.50, 1.50);
		WaterBottle bottle3 = new WaterBottle(10.00, 2.50);
		
		//test LunchBagWaterBottle
		LunchBagWaterBottle bottle4 = new LunchBagWaterBottle();
		

		//change bottle3 color to blue
		bottle3.setColor("blue");

		//output out results
		//System.out.printf("A %s water bottle with height %.2f and radius %.2f\n", bottle1.color, bottle1.height, bottle1.radius);
		//System.out.printf("A %s water bottle with height %.2f and radius %.2f\n", bottle2.color, bottle2.height, bottle2.radius);
		//System.out.printf("A %s water bottle with height %.2f and radius %.2f\n", bottle3.color, bottle3.height, bottle3.radius);
		
		//print output
		System.out.println(WaterBottle.getLargestInitialVolume());
		System.out.println(bottle1.getInfo());
		System.out.println(bottle2.getInfo());
		System.out.println(bottle3.getInfo());
		
		System.out.println(bottle4.getInfo());
	}
}
