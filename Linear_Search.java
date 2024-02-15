package Array_Search_Sort;
import java.util.Scanner;

public class Linear_Search {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;) {
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.println("Enter Number to Seach");
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				System.out.println("Element Exist at Index "+i);
				x=0;
			}
		}		
	}
}
