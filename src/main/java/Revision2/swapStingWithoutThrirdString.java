package Revision2;

public class swapStingWithoutThrirdString {
	public static void main(String[] args) {
		String s1="ram";
		String s2="shama";
		System.out.println("befour swap");
		System.out.println(s1);
		System.out.println(s2);
		
		
		s1=s1+s2;
		
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("after swap");
		System.out.println(s1);
		System.out.println(s2);		
	}

}
