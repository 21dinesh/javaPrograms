package ReverseArrayPro;

public class SecoundMax {
	public static void main(String[] args) {
	int [] a= {7,5,4,9,6};
	
	int max= Integer.MIN_VALUE;
	int Sec_max= Integer.MIN_VALUE;
	
	for (int i = 0; i < a.length; i++) {
		if(a[i] > max) {
			Sec_max = max;
			max=a[i];
		}
		else if (a[i] > Sec_max && a[i] != max) {
        Sec_max= a[i];			
		}
		
	} 
	System.out.println(Sec_max);
}

}
