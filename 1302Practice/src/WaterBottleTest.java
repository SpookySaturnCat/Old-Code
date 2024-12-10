
public class WaterBottleTest {

	public static void main (String[] args) {
		
		// Default no args bottle
		WaterBottle bottle1 = new WaterBottle();
		System.out.println(bottle1.getInfo());
		System.out.println(WaterBottle.getLargestInitialVolume());
		
		// Convenience constructor bottle
		WaterBottle bottle2 = new WaterBottle(9.5, 1.5);
		System.out.println(bottle2.getInfo());
		System.out.println(WaterBottle.getLargestInitialVolume());
		
		
		WaterBottle bottle3 = new WaterBottle(10.00, 2.5);
		bottle3.setColor("blue");
		bottle3.setRadius(-2);
		System.out.println(bottle3.getInfo());
		System.out.println(WaterBottle.getLargestInitialVolume());

	}
}
