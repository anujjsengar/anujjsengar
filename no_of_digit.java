package Basic_Program;
import java.util.*;
public class no_of_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		while(n>0) {
			x++;
			n=n/10;
		}
		System.out.println(x);

	}

}
