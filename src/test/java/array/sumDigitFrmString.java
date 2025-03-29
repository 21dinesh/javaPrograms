package array;

public class sumDigitFrmString {
	public static int sumDigits(String s) {
		int sum = 0;
		char[] charArray=s.toCharArray();
		for (char c:charArray) {
			if (Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		return sum;
	}	
	public static void main(String[] args) {
		String s="a2df23g6f4";
		System.out.println("sum of digits "+sumDigits(s));
	}
}
