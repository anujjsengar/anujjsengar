package BackTracking;

public class Permutation {
	public static void permut(int [] arr,boolean[] bool,int n,String ans) {
		if(n==arr.length) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<arr.length;i++) {
			if(bool[i]==false) {
				bool[i]=true;
				permut(arr,bool,n+1,ans+arr[i]);
				bool[i]=false;
			}
		}
	}
	public static void main(String args[]) {
		boolean [] bool=new boolean[3];
		int[] arr= {1,2,3};
		permut(arr,bool,0,"");
		
		
	}

}
