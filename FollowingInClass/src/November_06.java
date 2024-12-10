
public class November_06 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		// i = row
		for (int i = 0; i < arr.length; i++) {
			// j = col
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 101);
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int[] currArray : arr) {
			for (int currValue : currArray) {
				System.out.printf("%d ", currValue);
			}
			System.out.println();
		}
		
		for (int i = 0, j = 0; i < arr.length; i++, j++) {
			
			double sum = 0;
			
			sum += arr[i][j];
			
			System.out.printf("%d ", arr[i][j]);
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			double sum = 0, total = 0;
			// j = col
			for (int j = 0; j < arr[i].length; j++) {
				sum = 0;
				sum += arr[i][j];
				total += sum;
				}
			System.out.printf("%d ", sum);
			System.out.println();
		}
		
	}
}
