package Revision2;

public class firstLetterUpercase {
public static void main(String[] args) {
	String s="doremon and nobita are good friends";
	String []arr=s.split(" ");
	for (int i = 0; i < arr.length; i++) {
		String s1=arr[i];
		System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		
	}
}
}
