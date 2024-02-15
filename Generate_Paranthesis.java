package Class_Lecture;
import java.util.*;
public class Generate_Paranthesis {
	public static void main(String args[]) {
		ArrayList<String> arr=new ArrayList<>();
		generate(3,0,0,"",arr);
		System.out.println(arr);
	}
	private static void generate(int n,int open,int close,String ans,ArrayList<String> list) {
		if(n==open && n==close) {
			list.add(ans);
			//System.out.println(ans);
			return ;
		}
		if(open<n && close<n && open>=close) {
			generate(n,open+1,close,ans+"(",list);
			generate(n,open,close+1,ans+")",list);
		}
		if(open==n && close<n) {
			generate(n,open,close+1,ans+")",list);
		}
	}
}
