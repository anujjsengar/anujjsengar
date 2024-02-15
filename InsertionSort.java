package Basic_Program;

public class InsertionSort {
	public static int[] Insertion(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
		
	}
	public static void printArray(int[]num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String args[]) {
		int[] a= {1,5,2,3,2};
		printArray(Insertion(a));
	}

}
