package mislineous;

public class stringManipulation {
	public static void main(String[] args) {
		String Str= "I123 23love 28india";
		 String s1 = Str.substring(1,4);
		int n1=Integer.parseInt(s1);
		
		String s2 =Str.substring(5,7);
		int n2= Integer.parseInt(s2);
		
		String s3 =Str.substring(12,14);
		int n3= Integer.parseInt(s3);
		
		System.out.println(n1+n2+n3 );
		
		
	
  }
}
