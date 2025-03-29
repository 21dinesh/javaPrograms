package InterviewQus;

public class stringpinLab {
	public static void main(String[] args) {
		String s="seljavaselpythonseljavasel";
		String s2="sel";
		int count=0;
		for (int i = 0; i <= s.length()-s2.length(); i++) {
		 String s3=s.substring(i,i+s2.length());	
		 if (s2.equals(s3)) {
			 count++;
		 }
		}System.out.println(count);
	}

}
