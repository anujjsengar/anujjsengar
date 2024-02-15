package Basic_Program;

public class even_number {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			int x=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					x++;
					break;
				}
			}
			if(x==0) {
				System.out.println(i);
			}
		}

	}

}
