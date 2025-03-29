package InterviewQus;

public class palindrome {
	public static void main(String[] args) {
		String str="abcba";
		String str1="";
		for (int k = str.length()-1; k >=0; k--) {
		 char ch=str.charAt(k);
		str1+=ch;
		
		}
		if (str.equalsIgnoreCase(str1)) {
			System.out.println(str1 +"is palindrome");
		} else {
         System.out.println("Not palindrome");
		}
		}
	
}
