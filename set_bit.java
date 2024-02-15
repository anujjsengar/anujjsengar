package Bitmasking;

import java.util.Scanner;

public class set_bit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println(" Enter Bit Position: ");
		int x=sc.nextInt();
		int bitmask=1<<x;
		int result=n+bitmask;
		System.out.println("Result after setting bit: "+ result);

	}

}
