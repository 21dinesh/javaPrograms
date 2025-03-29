package InterviewQus;

public class getNextMaxNumber {
	public static void main(String[] args) {
		int a[]= {8,4,1,9,6,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]+1==a[j]||a[i]+2==a[j]) {
					System.out.println(a[i]+ ">" +a[j]);
					
				}
				
			}
		}
	}

}
