package Basic_Program;

public class Array {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int j=0;
		for(int i=0;i<4;i++) {
			if(i%2==0) {
				j=0;
			}
			else {
				j=3;
			}
			while(j>0) {
				System.out.print(arr[i][j]+" ");
				if(i%2==0) {
					j++;
				}
				else {
					j--;
				}
			}
		}

	}

}
