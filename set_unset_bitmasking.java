package Bitmasking;
public class set_unset_bitmasking {
	public static void main(String[] args) {
		int n=6;
		int count=0;
		int count2=0;
		for(int i=0;i<4;i++) {
			count=count+checkset(i,n);
		}
		System.out.println("No of set bits are: " + count);
			while(n!=0) {
				n=(n&n-1);
				count++;
			}
		System.out.print("No of set bits are: " + count2);
		int x=setbit(2,n);
		System.out.print(x);
		}

	private static int checkset(int i,int n) {
		n=(n>>i);
		if((n&1)==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	private static int setbit(int i,int n) {
		int x=0;
		n=(n<<i);
		return x+n;
			
		}
	

}
