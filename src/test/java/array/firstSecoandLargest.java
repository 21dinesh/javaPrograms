package array;

public class firstSecoandLargest {
	
	public static void printFirstSecond( int a[]) {
		int first=a[0];
		int second=a[0];
		for (int i=0;i<a.length;i++) {
			if(first<a[i]) {
				second=first;
				first=a[i];
			}
			if(second<a[i] && a[i]!=first) {
				second=a[i];
			}
			}
		System.out.println(first);
		System.out.println(second);
	}
	public static void main(String[] args) {
		int[] arr= {12,1,10,9,80,88};
		printFirstSecond(arr);
	}

}
