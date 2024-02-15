package BackTracking;

public class All_Possible_Path {
	static int count=0;
	public static void main(String args[]) {
		int [][] arr=new int[300][300];
		path(arr,0,0,"");
		System.out.println(count);
	}
	private static void path(int arr[][],int r,int c,String ans) {
		if(r==arr.length-1 && c==arr[0].length-1) {
			System.out.println(ans);
			count++;
			return ;
		}
		if(r<0 || c<0||c==arr.length|| c==arr[0].length || r==arr.length || arr[r][c]==1) {
			return ;
		}
		if(arr[r][c]==0) {
			arr[r][c]=1;
			path(arr,r+1,c,ans+"V");
			path(arr,r,c+1,ans+"H");
			path(arr,r-1,c,ans+"V");
			path(arr,r,c-1,ans+"V");
			path(arr,r-1,c-1,ans+"D1");
			path(arr,r-1,c+1,ans+"D2");
			path(arr,r+1,c-1,ans+"D3");
			path(arr,r+1,c+1,ans+"D4");
			arr[r][c]=0;
		}
	}

}
