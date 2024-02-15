package BackTracking;

public class Longest_Common_Sequence_Greek {
	public static void main(String args[]) {
		String s1="ABC";
		String s2="BC";
		sequence(s1,s2,"",0);
	}
	private static void sequence(String s1,String s2,String ans,int i) {
			if(i<s2.length()-1) {
				System.out.println(ans);
				return ;
				}
			if(s2.indexOf(s1.charAt(i))!=-1) {
				sequence(s1,s2.substring(i+1),ans+s1.charAt(i),i+1);
			}
			else {
				sequence(s1,s2,ans,i+1);
			}
	}

}
