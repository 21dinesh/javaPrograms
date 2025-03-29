package Revision2;

public class onlyUniqueInString {
	public static void main(String[] args) {
		String s="Java";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

}
