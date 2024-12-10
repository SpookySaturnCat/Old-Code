
public class October_30 {
	public static void main(String[] args) {

		int[] random = new int[100];
		// Key is what we are looking for, keyLoc is to find the index and filled with a
		// dummy value
		int key = 32, keyLoc = -1;

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 101);
		}

		keyLoc = linearSearch(random, key);
		// keyLoc = bianarySearch(random, key);

		if (keyLoc != 1) {
			System.out.printf("Found %d at index location %d", key, keyLoc);
		} else {
			System.out.printf("%d not found%n",key);
		}
	}
	
	public static int bianarySearch(int[] random, int key) {
		
		int low = 0, high = random.length -1, mid = random.length / 2;
		
		while (low <= high) {
			mid = (low + high) /2;
			if (random[mid] == key) {
				return mid;
			} else if (random[mid] > key) {
				high = mid - 1;
			} else {
				low = mid - 1;
			}
		}
		return -1 - low;
	}

	public static int linearSearch(int[] random, int key) {

		int keyLoc = -1;
		for (int i = 0; i < random.length; i++) {
			if (random[i] == key) {
				keyLoc = i;
			}
		}
		return keyLoc;
	}
}