package stringMethods;

public class occurrencePrint {
	public static void main(String[] args) {
		String str="a3d3f5";
		
		for (int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 int num=str.charAt(i+1)-48;
			 for (int j=1;j<=num; j++ ) {
				 System.out.print(ch);
			 }
			 i++;
		}
	} 

}
