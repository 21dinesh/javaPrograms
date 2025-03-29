package Revision2;

public class duplicateinString {
	public static void main(String[] args) {
		String s="patato";
		for (int i = 0; i < s.length()-1; i++) {
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch)&& i==s.indexOf(ch) ) {
				System.out.print(ch);
			}
			
		}
	}

}
