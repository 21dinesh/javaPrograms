package stringMethods;


public class countUniqNumber {
	public static String countUniq(String str) {
		String str2 = "";
		for(int i=0; i<str.length();i++)
		
			if(str.charAt(i)==str.charAt(i-1)) {
				
			}else {	
		}			
		return str2; 	
	}
	public static void main(String[] args) {
		String str = "committee";
		countUniq(str);
		
	}

}
