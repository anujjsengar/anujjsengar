package Bitmasking;

import java.util.Scanner;

public class clear_bit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println(" Enter Bit Position: ");
		int x=sc.nextInt();
		int bitmask=(1<<x)^7;
		int result=bitmask&n;
		System.out.println("After Clear Result: "+ result);

}
}