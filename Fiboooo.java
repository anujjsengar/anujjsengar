package Basic_Program;

public class Fiboooo {
	public static void fibooSeries(int num) {
		int a=0,b=1,c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			}
		}
	public static void main(String args[]) {
		fibooSeries(10);
	}

}
