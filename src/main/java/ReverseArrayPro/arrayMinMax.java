package ReverseArrayPro;

public class arrayMinMax {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		int max=a[0];
		int min=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}System.out.println("Min in array is " + min ); 
	     System.out.println("Max in array is "+ max);
	}

}
