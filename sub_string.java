package Basic_Program;

public class sub_string {

	public static void main(String[] args) {
		String s="Hello";
		int l=s.length();
		for(int i=0;i<l;i++) {
			String x="";
			for(int j=i+1;j<l;j++) {
				x=s.substring(i,j);
			}
			for(int a=i+1;a<l;a++){
				for(int b=a+1;b<l;b++) {
					if(x==s.substring(a,b))
						System.out.println(x);
				}
		}
	}

}
}
