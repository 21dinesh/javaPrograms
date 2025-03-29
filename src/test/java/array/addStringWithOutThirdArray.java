package array;

public class addStringWithOutThirdArray {
	    public static void main(String[] args) {
	        String str1="abc";
	        String str2="xyz";
	        
	       System.out.println("string 1 is " +str1);
	       System.out.println("string 2 is "+str2 );
	        str1=str1+str2;
	        str2=str1.substring(0,str1.length()-str2.length());
	        str1=str1.substring(str2.length());
	       System.out.println("string 1 is " +str1);
	       System.out.println("string 2 is "+str2 );
	        
	    }
	}

