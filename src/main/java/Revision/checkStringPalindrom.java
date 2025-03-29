package Revision;


public class checkStringPalindrom {
	public static void main(String[] args) {
		String s="aabbcbbaa";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("The String "+s+" is Palindrom");
		}else {
			System.out.println("The String is NOT Palindrom");
		}
	}

}
