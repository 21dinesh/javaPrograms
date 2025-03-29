package InterviewQus;

public class resideo {
//	1. String s= new String ("hello");
//    String s1=new String ("hello");
//If I compare s==s1 what's the output and why?
//2. String s="hello";
//    String s1="hello";
//If s==s1 what's the output and why? 
public static void main(String[] args) {
	 String ss= new String ("hello");
     String ss1=new String ("hello");
     System.out.println(ss.equals(ss1));
     System.out.println(ss);
     System.out.println(ss1);
     
      
      String s="hello";
      String s1="hello";
System.out.println(s==s1); 
System.out.println(s.hashCode());
System.out.println(s1);
System.out.println(s.toString());
}
}
