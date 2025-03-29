package pattens;

public class countingPrimind {
	public static void main(String[] args) {
		int n=4;
		int count=1;
		for (int i = 1; i <=n; i++) {
			for (int j = n-i; j >=1; j--) {
					System.out.print("  ");
            				
			}
			for (int k = 1; k <=2*i-1; k++) {
				if (count<=14) {
					System.out.print(count+" ");	
				}
				
				count++;
			}
			System.out.println();
		}
	}

}
