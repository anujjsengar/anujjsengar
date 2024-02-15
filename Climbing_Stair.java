package Class_Lecture;
import java.util.*;
public class Climbing_Stair {
	public static void main(String args[]) {
		System.out.println(stair(2,0));
	}
	private static int stair(int n,int count) {
		if(n==0) {
			count++;
			return count ;
		}
		if(n<0) {
			return 0;
		}
		return stair(n-1,count)+stair(n-2,count);
	}
}
