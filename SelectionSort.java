package Basic_Program;

public class SelectionSort {
	public static int[] Selection(int[] arr) {
		int minindex=0;
		for(int i=0;i<arr.length-1;i++) {
			minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[minindex]) {
					minindex=j;
				}
				int temp=arr[minindex];
				arr[minindex]=arr[j];
				arr[j]=temp;
			}
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] a= {1,5,2,3,2,54,23,56};
		printArray(Selection(a));
}
}