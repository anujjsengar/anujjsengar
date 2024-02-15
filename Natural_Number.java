package Basic_Program;
import java.util.*;

public class Natural_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(n>0) {
			System.out.println(i);
			i++;
			n--;
		}

	}

}
