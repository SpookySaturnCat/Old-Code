
public class ArrayExampleInClass {
	public static void main(String[] args) {

		int[] randomArrayExample = new int[10];
		int sum = 0, largest = 0, index = 999;

		for (int i = 0; i < randomArrayExample.length; i++) {
			randomArrayExample[i] = (int) (Math.random() * 1001);
			System.out.printf("%d: %d%n", i, randomArrayExample[i]);
			sum += randomArrayExample[i];
			
			if (randomArrayExample[i] > largest) {
				largest = randomArrayExample[i];
				index = i;
			}
			System.out.printf("Sum at %d: %d %n%n", i, sum);
		}
		System.out.printf("The largest is %d at index %d", largest, index);

	}
}
