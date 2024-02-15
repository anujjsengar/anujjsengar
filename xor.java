package Bitmasking;
import java.util.Scanner;
public class xor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int result=(n^x);
		System.out.println("XOR of "+n+" and "+x +" is " +result);
	}

}
