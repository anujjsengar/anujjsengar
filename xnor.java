package Bitmasking;

import java.util.Scanner;

public class xnor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int sum=0;
		for(int i=0;i<b;i++) {
			sum=sum+(int)Math.pow(2, i);
		}
		int n=sc.nextInt();
		int x=sc.nextInt();
		int result=(n^x)^7;
		System.out.println("XNOR of "+n+" and "+x +" is " +result);
	}
}
