package Assignment;

public class reverseAtOwnPlace {
	public static void main(String[] args) {
		String s="call me at Night";
		String[] str=s.split(" ");
		String a="";
		String b="";
		for (int i = 0; i < str.length; i++) {
			a=str[i]+" "+a;
		}
		for (int j = 0 ; j <a.length(); j++) {
           b=a.charAt(j)+b;				
			}
			
		System.out.println(b);
	}

}
