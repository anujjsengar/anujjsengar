package Basic_Program;

public class spiral_print_2dArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int minr=0;
		int minc=0;
		int maxr=arr[0].length-1;
		int maxc=arr[1].length-1;
		for(int i=minc;i<=maxc;i++)
			System.out.print(arr[0][i]+" ");
		maxr--;
		for(int i=minr;i<=maxc;i++) {
			System.out.print(arr[i][maxc]+" ");
		}
		maxc--;
		for(int i=maxc;i>=minc;i--) {
			System.out.print(arr[maxr][i]+" ");
		}
		maxr--;
		for(int i=maxr;i>=minr;i--) {
			System.out.print(arr[i][minc]+" ");
		}
	}
}
		

