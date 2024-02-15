package Recurssion;

public class Binary_Decimal {
	public static void convert(int num,int base) {
		if(num==0) {
			return ;
		}
		System.out.print(num%base);
		convert(num%10,base);
	}
	public static void main(String args[]) {
		convert(10,2);
	}

}
