package Basic_Program;
import java.util.*;
public class sum_first_last_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		int l=0;
		int x=1;
		while(n>0) {
		int rem=n%10;
		n=n/10;
		if(n<=0) { 
			f=rem;
		}
		if(x==1) {
			l=rem;
		}
		x++;
	}
		System.out.println(f+l);
	
}
	}
