package october;

import java.util.Arrays;

public class Part1 {
	public static void main(String[] args) {
 
	int[] ans = { 1, 2, 1};
	
	int[] answer = getConcatenation(ans);
	
	System.out.print(Arrays.toString(answer));
	}
 
 public static int[] getConcatenation(int[] nums) {
	 
	 int[] ans = new int[nums.length * 2];
	 
	 for (int i = 0; i < nums.length; i++) {
		 
		 ans[i] = nums[i];
		 ans[i + nums.length] = nums[i];
	 }
	 return ans;
	 
 }
	 }
 
