package Basic_Program;

public class goodstring {

	public static void main(String[] args) {
		String str="anuj";
		String s="";
		int n=0;
		for(int x=0;x<str.length();x++) {
			for(int y=x+1;y<str.length();y++) {
				s=str.substring(x,y);
				for(int a=0;a<s.length();a++) {
					if(s[a]=="a" || s[a]=="e" || s[a]=="i" || s[a]=="o") {
						
					}
				}
			}
		}
	}

}
