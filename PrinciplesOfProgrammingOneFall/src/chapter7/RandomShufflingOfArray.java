package chapter7;

public class RandomShufflingOfArray {

	public static void main(String[] args) {
		
		int[] myList = { 1, 2, 3, 4, 5};
		
		for (int i = 0; i <myList.length - 1; i++) {
			
			// Generate an index j randomly
			int j = (int) (Math.random() * myList.length);
			
			// Swap myList[i] with myList[j]
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
	}
}
