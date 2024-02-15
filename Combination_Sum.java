package Class_Lecture;

import java.util.*;

public class Combination_Sum {
	public static void main(String args[]) {
		int [] candidates= {2,3,6,7};
	ArrayList<Integer> ans=new ArrayList<>();
    List<List<Integer>> list=new ArrayList<>();
    sum_target(candidates,7,ans,list);
    System.out.println(list);
}
private static void sum_target(int[] arr,int target,ArrayList<Integer> ans,List<List<Integer>> list){
    if(target==0){
        list.add(new ArrayList<>(ans));
        return ;
    }
    if(target<0){
        return ;
    }
    for(int i=0;i<arr.length;i++){
        ans.add(arr[i]);
        sum_target(arr,target-arr[i],ans,list);
        ans.remove(ans.size()-1);
    }
}
}
