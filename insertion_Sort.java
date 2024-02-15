package Basic_Program;

public class insertion_Sort {

	public static void main(String[] args) {
		private static void sorting(int[] arr) {
			for(int i=1;i<arr.length();i++) {
				int key=arr[i];
				int j=i-1;
				while(j>=0 && key<arr[i]) {
					arr[j+1]=arr[j];
					j--;
				}
				key=arr[j+1];
				}
			}
	}

}
