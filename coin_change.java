package Recurssion;

public class coin_change {
	static int k=Integer.MAX_VALUE;
	public static void coin(int[] num,int x,String ans) {
		if(x==0) {
			if(ans.length()<k) {
				k=ans.length();
			}
			return;
		}
		if(x<0) {
			return;
		}
		for(int i=0;i<num.length;i++) {
			coin(num,x-num[i],ans+num[i]);
		}
	}
	public static void main(String args[]) {
		int[] arr= {1,2,5};
		int x=8;
		coin(arr,x,"");
		System.out.println(k);
	}

}
