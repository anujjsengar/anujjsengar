package Basic_Program;
import java.util.*;
public class first_last_digit_of_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		while(n>0){
			int rem=n%10;
			n=n/10;
			if(n<=0) { 
				System.out.println("First Digit "+rem);
			}
			if(x==1) {
				System.out.println("Last Digit "+rem);
			}
			x++;
		}
		
	}
}
