package parttens;

public class P2 {
	public static void main(String[] args) {
		int row=5;
		for (int i = 1; i <row; i++) {
			
			for (int j = 1; j <= (row-i); j++) {
			    System.out.print("  ");	
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}
			for(int l=i-1 ; l>=1 ; l--) { 
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}
