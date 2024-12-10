public class Feb06 {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 1 , 4 };

		System.out.println(canJump(arr));
	}

	public static Boolean canJump(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
			if (arr[i] == arr[arr.length - 1]) {
					return true;
				}
			} else {
				return false;
			}
		}
		return true;
	}
}
