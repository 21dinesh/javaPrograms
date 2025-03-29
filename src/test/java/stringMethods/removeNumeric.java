package stringMethods;

public class removeNumeric {
	public static void main(String[] args) {
	String s="a2b3c#d$%4A5B7";
	
	String s1=s.replaceAll("[^a-zA-Z0-9]", "");
	
	//printing spicialcharacter
	String s2=s.replaceAll("[a-zA-Z0-9]", "");
	
	//printing digits
	String s3=s.replaceAll("[^0-9]", "");
	
	//printing lowercase and 
	String s4=s.replaceAll("[^0-9a-b]", "");
	System.out.println("Actual String "+s);
	System.out.println(s1);
	System.out.println("spicialcharacter "+s2);
	System.out.println(s3);
	System.out.println(s4);
}

}
