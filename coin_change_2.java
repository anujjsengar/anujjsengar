package Recurssion;

public class coin_change_2 {
	static int count=0;
	public static void coin(int arr[],int target,String ans) {
		if(target==0) {
			count++;
			System.out.println(ans);
			return;
		}
		if(target<0) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			coin(arr,target-arr[i],ans+arr[i]);
		}
	}
	public static void main(String args[]) {
		int [] arr= {2,5,3,6};
		int target=10;
		coin(arr,target,"");
		System.out.print(count/2+1);
	}

}
