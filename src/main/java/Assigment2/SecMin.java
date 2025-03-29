package Assigment2;

public class SecMin {
	public static void main(String[] args) {
		int [] a= {7,5,4,9,6};
		
		int min= Integer.MAX_VALUE;
		int Sec_min= Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min) {
				Sec_min = min;
				min=a[i];
			}
			else if (a[i] < Sec_min && a[i] != min) {
	        Sec_min= a[i];			
			}
			
		} 
		System.out.println(Sec_min);
	}

}
