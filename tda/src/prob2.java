import java.util.Arrays;

public class prob2 {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
		
		System.out.println(majorityElement(arr));
	};
	
	public static int majorityElement(int[] arr) {
		
		Arrays.sort(arr);
		return arr[arr.length / 2];
	}
}
