package AssignmentofArray;

import java.util.Scanner;

public class FindAccending {
	
	public static void main(String[] args) {
		int num;
		boolean n= true;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter The Number in Array:");
		for(int i=0;i<5;i++) {
			
			arr[i] = scan.nextInt();
			
		}
		for(int i=0;i<5-1;i++)
		{
			num = arr[i+1];
			if(arr[i]>num) {
				n = false;
				break;
			}
		}
		if(n==false)
		{
		           System.out.println("FALSE");
	}
		else {
			System.out.println("TRUE");
		}

    }

}
