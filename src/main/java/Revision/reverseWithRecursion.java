package Revision;

public class reverseWithRecursion {
public static void main(String[] args) {
	String s="get Up";
	System.out.println("String without reverse"+ s);
	reverse(s);
	
}
public static void reverse(String s) {
	if(s.length()>0) {
		System.out.print(s.charAt(s.length()-1));
		reverse(s.substring(0,s.length()-1));
	}
	
}
}
