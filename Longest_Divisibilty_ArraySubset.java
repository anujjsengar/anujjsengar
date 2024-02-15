package Class_Lecture;

public class Longest_Divisibilty_ArraySubset {
	public static void main(String args[]) {
		int[] arr= {1,2,3};
		boolean[] bool=new boolean[arr.length];
		subset(arr,bool,"","");
	}
	private static void subset(int arr[],boolean[] bool,String ans,String temp) {
		if(ans.length()>temp.length()) {
			temp=ans;
		}
		for(int i=0;i<arr.length;i++) {
			if(bool[i]=false) {
				bool[i]=true;
				if(i + 1 < arr.length && arr[i]%arr[i+1]==0||arr[i+1]%arr[i]==0) {
					subset(arr,bool,ans+arr[i],temp);
				}
				else {
					ans=ans+arr[i];
					return ;
				}
				bool[i]=false;
			}
		}
		System.out.print(temp);
}
}
