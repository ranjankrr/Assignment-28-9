package AssignmentofArray;

import java.util.Scanner;
public class FindMinimum {
	
	 public static void main(String[] args)
	   {
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Please enter total number: ");
	      int number = scan.nextInt();
	 
	      int minimum = Integer.MAX_VALUE;
	      System.out.println("Please enter " + number + " number.");
	      for(int i = 0; i < number; i++)
	      {
	         int num = scan.nextInt();
	     
	         if(num < minimum)
	         {
	            minimum = num;
	         }
	      }
	      System.out.println("smallest of " + number + " numbers is: " + minimum);
	     
	   }

}
