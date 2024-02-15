package Class_Lecture;
import java.util.*;
public class Permutation_Array {
	public static void main(String args[]) {
		int [] arr= {2,3,1};
		boolean [] bool=new boolean[arr.length];
		ArrayList<Integer> ans=new ArrayList<>();
		List<List<Integer>> list=new ArrayList<>();
		permut(arr,bool,ans,list);
		System.out.println(list);
	}
	private static void permut(int arr[],boolean[] bool,ArrayList<Integer> ans,List<List<Integer>> list) {
		if(ans.size()==arr.length) {
			list.add(new ArrayList<>(ans));
			return ;
		}
		for(int i=0;i<arr.length;i++) {
			if(bool[i]==false) {
				bool[i]=true;
				ans.add(arr[i]);
				permut(arr,bool,ans,list);
				ans.remove(ans.size()-1);
				bool[i]=false;
			}
		}
	}
}
