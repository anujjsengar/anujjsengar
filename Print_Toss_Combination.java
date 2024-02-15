package Class_Lecture;

public class Print_Toss_Combination {
	public static void main(String args[]) {
		toss(3,"");
	}
	private static void toss(int n,String ans) {
		if(n==0) {
			System.out.println(ans);
			return ;
		}

			toss(n-1,ans+"H");
			toss(n-1,ans+"T");
		}
		
}
