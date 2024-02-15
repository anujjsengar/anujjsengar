package Array_Search_Sort;

public class String_Buffer {
	public static void main(String args[]) {
		StringBuffer str=new StringBuffer("Anuj");
		str.append("Lovely");
		str.charAt(5);
		str.length();
		str.insert(4," Loves ");
		str.indexOf("L");
		str.lastIndexOf("L");
		str.setCharAt(4, 'S');
		str.setCharAt(str.length()-1, 'S');
		System.out.println(str);
	}

}
