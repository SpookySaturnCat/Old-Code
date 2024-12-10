package chapter7;

public class ShiftingElementsInArray {
	public static void main(String[] args) {
		
		int[] myList = { 1, 2, 3, 4, 5 };
		int temp = myList[0];
		
		for (int i = 1, j = 1; i < myList.length; i++, j ++); {
			
			// why is there an error unless i do this
			int j = 1;
			myList[j - 1] = myList[j];
			j++;
	}
		myList[myList.length -1] = temp;
	
	}
}
