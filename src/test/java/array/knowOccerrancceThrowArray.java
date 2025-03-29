package array;
public class knowOccerrancceThrowArray {

	public static void main(String[] args) {	
		String s="anddjhuhabs";	
	    int[] count=new int [256];
	     for (char c:s.toCharArray()) {
	    	 count [c]++;  	 
	      }   
	      for (int i=0; i<s.length();i++) { 	    	
			char c=s.charAt(i);
			if (count[c]!=0) {
			
	    	System.out.println(c + " occurs " +count[c] +" times");
	    	count[c]=0;
	    }}
	}
}
