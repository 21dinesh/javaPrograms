package array;

public class sumDigitFrmString2 {
	public static int sumDigits(String s) {
		int sum = 0;

     for (int i=0;i<s.length();i++) {
	 if (s.charAt(i)>=0 && s.charAt(i)<=9) {
		 sum =sum +s.charAt(i);
		 System.out.println(i);
	 }
	 System.out.println(i);
    }
		return sum;
	}
	public static void main(String[] args) {
		String s="a2df23g6f4";
		System.out.println("sum of digits "+sumDigits(s));
	}
}
