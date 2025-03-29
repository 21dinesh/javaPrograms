package recursion;

public class recursion_factorial {
	public static int rec(int n) {
	
		if (n==1) {
			return 1;
		}
		int factorial =n*rec(n-1);
		return factorial;
	}
public static void main(String[] args) {
	System.out.println(rec(5));
}

}
