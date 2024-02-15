package Bitmasking;

public class even_odd_bitmasking {
	public static void main(String args[]) {
	int n=12;
	check(n);
}
private static void check(int n){
	int x=n;
	if((x&1)==0){
		System.out.print("Even")	;
		}
	else {
		System.out.print("odd");
	}
}
}