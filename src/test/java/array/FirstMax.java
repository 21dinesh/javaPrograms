package array;

public class FirstMax {
	public static void main(String[] args) {
		int arr[]= {9,3,4,5,76,99,12};
		int largest=arr[0];
		int second=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(largest<arr[i]) {
				second = largest;
				largest=arr[i];
			}
			if (second <arr[i] && arr[i]!=largest) {
				second=arr[i];
			}}
		System.out.println("largest number is "+largest );
		System.out.println("second number is "+second );
		
	}

}
