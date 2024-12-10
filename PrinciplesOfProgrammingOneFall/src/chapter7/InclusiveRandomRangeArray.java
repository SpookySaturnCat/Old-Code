package chapter7;

public class InclusiveRandomRangeArray {

	public static void main(String[] args) {
		
		int upper = 10, lower = -10;
		
		int[] arrayList = new int[20];
		
		for (int i = 0; i < arrayList.length; i++) {
			
			arrayList[i] = (int) (lower + Math.random() * (upper - lower + 1));
		}
		
		int[] newArray = new int[10];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = (int) (lower + Math.random() * (upper - lower + 1));
		}
	
	
		int[] lastTime = new int[5];
		
		for (int i = 0; i < lastTime.length; i++) {
			lastTime[i] = (int) (upper - Math.random() * (upper - lower + 1));
		}
	}
	
}
