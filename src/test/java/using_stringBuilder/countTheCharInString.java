package using_stringBuilder;

public class countTheCharInString {
	public static String countChar(String str) {
		StringBuffer result= new StringBuffer();
		int count=1;
		
		for (int i=1;i<str.length();i++) {
			if (str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				result.append(str.charAt(i-1)).append(count);
				count= 1;
			} 
	} result.append(str.charAt(str.length()-1)).append(count);
	  return result.toString();
	}
	
	public static void main(String[] args) {
		String str="aabbcccd";
		System.out.println(str);
		String str2=countChar(str);
	System.out.println(str2);
		
	
	}
}
