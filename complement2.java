package Bitmasking;

import java.util.Scanner;

public class complement2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int sum=0;
		for(int i=0;i<b;i++) {
			sum=sum+(int)Math.pow(2, i);
		}
		int n=5;
		int x=((n^sum)+1);
		System.out.println("1's Complement of " +n +" is " + x);

	}

}
