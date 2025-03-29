package stringMethods;

public class swapFirstAndLastWord {
	
	public static void swpWrld(String str) {
	System.out.println(str);
	String strArray[]=	str.split(" ");
	String tempStr=strArray[0];
	strArray[0]=strArray[3];
	strArray[3]=tempStr;
	  for (int i = 0; i < strArray.length; i++) {
		System.out.print(strArray[i]+" ");	
	  }
	
	}
	public static void main(String[] args) {
		String str="welcome to tp office";
		swpWrld(str);
	}

}
