package Basic_Program;

public class GCD {
	public static int Gcd(int num1,int num2) {
		int x;
		int result=1;
		if(num1>num2) {
			x=num1;
		}
		else {
			x=num2;
		}
		for(int i=1;i<x;i++) {
			if(num1%i==0 && num2%i==0) {
				result=i;
			}
		}
		return result;
	}
	public static void main(String args[]) {
	System.out.println(Gcd(30,45));	
	}

}
