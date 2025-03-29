package stringMethods;

public class genrateSubstring {
	public static void main(String[] args) {
		String str="INDIA";
		for (int i=0;i<str.length();i++)
		{    String subStr="";
			for (int j=i;j<str.length();j++) {
				subStr= subStr+ str.charAt(j);
				if ((subStr.length()==2)||(subStr.length()==3)) {
				System.out.println(subStr);
				}
			}
		}
	}

}
