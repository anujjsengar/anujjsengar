package Recurssion;

public class Binary_Search {
	public static int search(int[] arr,int target,int start,int end) {
		if(arr[(start+end)/2]==target) {
			return (start+end)/2;
		}
		if(arr[(start+end)/2]>target) {
			start=0;
			end=(start+end)/2;
		}
		if(arr[(start+end)/2]<target) {
			start=(start+end)/2;
		}
		if(start==end) {
			return -1;
		}
		return search(arr,target,start,end);
	}
	public static void main(String args[]) {
		int[] arr= {-1,0,3,5,9,12};
		System.out.println(search(arr,12,0,arr.length));
		}

}
