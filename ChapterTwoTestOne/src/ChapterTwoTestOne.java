//PROBLEM1
//Identify and fix errors in code:


//public class ChapterTwoTestOne {
// public static void main(String[] args) {
// int i = k + 2;
// System.out.println(i);
//}
// }


  //ANSWER

  //public class ChapterTwoTestOne {
  //public static void main(String[] args) {
	
	 //int i, k;
	 //k = 9;
	 //i = k+2;
	 //System.out.println(i);//display to console computation
  //}
//}
//program runs properly, needed to add value
//to k, assigned one randomly

//PROBLEM2
//identify and fix the problems in the code:
//public class Test {
//public static void main(String[] args) {
//int i = j = k = 2;
//System.out.println(i + " " + j + " " + k);
//}
//}

//ANSWER

//public class ChapterTwoTestOne {
   //public static void main(String[] args) {
       //int j, k;
	   //int i = j = k = 2;      
     //System.out.println(i + " " + j + " " + k);
    //}
  //}
//program runs properly

//PROBLEM3
//Translate the following algorithm into Java code:
//Step 1: Declare a double variable named miles with an initial value 100.
//Step 2: Declare a double constant named KILOMETERS_PER_MILE with value 1.609.
//Step 3: Declare a double variable named kilometers, multiply miles and
//KILOMETERS_PER_MILE, and assign the result to kilometers.

//public class ChapterTwoTestOne{
	//public static void main(String[] args) {
		//double miles = 100;
		//final double KILOMETERS_PER_MILE = 1.609;
		//double kilometers = miles * KILOMETERS_PER_MILE;
		
		//System.out.println(kilometers);
		
	//}
	
//}//program runs properly


//PROBLEM4
//Reformat the following program according to the programming style and documentation guidelines. Use the end-of-line brace style.
//public class Test
//{
 //// Main method
 //public static void main(String[] args) {
 ///** Display output */
 //System.out.println("Welcome to Java");
 //}
//}

//public class ChapterTwoTestOne {
//	public static void main(String[]args) {
//		System.out.println("Welcome to Java");
//	}
//}
//works

//public class ChapterTwoTestOne {
	//public static void main(String[]args) {
		//double d = 4.5;
		//int i = (int)d;
		//System.out.println(d);
		//System.out.println(i);
	//}
//}

//import java.util.Scanner; //import scanner

//public class ChapterTwoTestOne {
	//public static void main(String[]args) {
      //Scanner input = new Scanner(System.in);//allows user input

		//System.out.println("Enter purchase amount: ");
		//double purchaseAmount = input.nextDouble(); //assigns double purchase amount to user input
		
		//double tax = purchaseAmount * 0.06; //Formula for tax
		//System.out.println("Sales tax is $" +(int)(tax*100)/100);
	//}
//}
//public class ChapterTwoTestOne {
	//public static void main(String[]args) {
	//	System.out.println("He said \"Java is fun\"");
		
   //}
//}

//public class ChapterTwoTestOne {
	//public static void main(String[]args) {
		
		//int x = 90;
		//if ((x<100) && (x>10))
		
		//System.out.println("x is between 10 and 100");
		
   //}
//}

//public class ChapterTwoTestOne {
	//public static void main(String[]args) {
		
		//int number = 45;
		//boolean even;
		//if(number % 2 ==0)
			//even = true;
		//else
			//even = false;
		
		//System.out.println(even);
		
   //}
//}
public class ChapterTwoTestOne {
	public static void main(String[]args) {
		
        int x = 3;
        int y = 4;
        switch (x+3) {
        
        case 6: y = 0;
        case 7: y = 1;
        default: y+=1;
        }
        System.out.println(y);
		
		}
}
		//System.out.println(x);
		
 //  }
//}