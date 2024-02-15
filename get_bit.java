package Bitmasking;
import java.util.Scanner;
public class get_bit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		System.out.println(" Enter Bit Position: ");
		int x=sc.nextInt();
		int bitmask=1<<x;
		if((bitmask&n)==0){
			System.out.println("Bit is 0");
		}
		else {
			System.out.print("Bit is 1");
		}
	}

}
