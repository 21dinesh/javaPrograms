package Revision2;

public class addingDigitFromString {
	public static void main(String[] args) {
		String s="2carret4rabbit";
		int sum=0;
		for (int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				sum=sum+ch-'0';
			}
		}System.out.println(sum);
	}

}
