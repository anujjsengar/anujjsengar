package Class_Lecture;
import java.util.*;
public class Coin_Change {
	static int size=Integer. MAX_VALUE;
	public static void main(String args[]) {
		int [] arr= {1,2,5};
		coin(arr,11,"");
		System.out.println(size);
	}
	private static void coin(int[] arr,int amount,String ans) {
		if(amount==0) {
			if(size>ans.length()){
				size=ans.length();
			}
			System.out.println(ans);
			return ;
		}
		if(amount<0) {
			return ;
		}
		for(int i=0;i<arr.length;i++) {
			coin(arr,amount-arr[i],ans+arr[i]);
		}
	}

}
