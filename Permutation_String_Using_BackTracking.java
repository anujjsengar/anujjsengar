package BackTracking;

public class Permutation_String_Using_BackTracking {
	public static void main(String args[]) {
		String str="ABC";
		boolean bool []=new boolean[3];
		permut(str,bool,"");
		
	}
	private static void permut(String str,boolean[] bool,String ans) {
		if(ans.length()==str.length()) {
			System.out.println(ans);
			return ;
		}
		for(int i=0;i<str.length();i++) {
			if(bool[i]==false) {
				bool[i]=true;
			permut(str,bool,ans+str.charAt(i));
			bool[i]=false;
		}
	}
}
}
