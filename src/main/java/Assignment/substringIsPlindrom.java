package Assignment;

public class substringIsPlindrom {
	public static void main(String[] args) {
		String s="aabbaa";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
		
		   String str = s.substring(i,j);
           String builder = new StringBuilder(str).reverse().toString();
     	  
           
		if(str.equals(builder)) {
           System.out.println(builder);
		}}	
	}
	}
}
