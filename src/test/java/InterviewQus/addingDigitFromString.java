package InterviewQus;

public class addingDigitFromString {
	public static void main(String[] args) {
		String s="dk123dk456f56";
		int sum='0', currentNumber='0';
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				currentNumber=currentNumber*10+ch-'0';
				sum=sum+ch;
			}
			else {
				sum=sum+currentNumber;
				currentNumber=0;
			}
		}
		sum=sum+currentNumber;
		System.out.println(sum);
		
	}

}
