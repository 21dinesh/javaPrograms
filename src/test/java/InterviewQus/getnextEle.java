package InterviewQus;

public class getnextEle {
	public static void main(String[] args) {
//if the next number of the digit is present in the array
		int a[]= {3,6,8,10,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+1==a[j]) {
	
				System.out.println(a[i]+" "+a[j]);
				}	
			}
		}
		
	}

}
