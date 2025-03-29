package recursion;

public class reverseUsingRecursion {
	
	public static String reverse(String str) {
		if (str.isEmpty()){
			return str;
		}
		//reverse 
		 System.out.println(str);	
		 String revstr = reverse(str.substring(1))+str.charAt(0);
		 System.out.println(revstr);
		 return revstr;
	}
	public static void main(String[] args) {
		String str="INDIA";
		System.out.println(str);
		String revStr = reverse(str);
		System.out.println(revStr);
		
	}

}
