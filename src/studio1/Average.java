package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer #1: ");
		int i1 = in.nextInt();
		System.out.print("Enter integer #2: ");
		int i2 = in.nextInt();
		double avg = (i1 + i2) / 2.0; 
		
		
		System.out.print("The average of these two values is "  + avg); 
	}

}
