package Basic_Program;

import java.util.Scanner;

public class digit_multiplication_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		while(n>0){
			int rem=n%10;
			f=f*rem;
			n=n/10;
			
	}
		System.out.println(f);
	}

}
