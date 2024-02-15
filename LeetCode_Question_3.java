package Class_Lecture;

public class LeetCode_Question_3 {
	public static void main(String args[]) {
		boolean[] bool=new boolean[8];
		substring("abcabcbb",bool,"",0,"");
		
	}
	public static void substring(String str,boolean[] bool,String ans,int ls,String s) {
		if(s.length()<ans.length()){
			s=ans;
		}
		if(ans.length()==str.length()) {
			System.out.println(s);
			return ;
		}
		for(int i=ls;i<str.length();i++) {
			if(bool[i]=false) {
				bool[i]=true;
				if(ans.indexOf(str.charAt(i))==-1) {
					substring(str,bool,ans+str.charAt(i),i+1,s);
				}
				bool[i]=false;
			}
		}
	}
}
