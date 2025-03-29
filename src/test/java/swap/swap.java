package swap;

public class swap {
	public static void swapWithOutVariable(int a, int b) {
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+ a);
		System.out.println("b is "+ b);
		
	}
	public static void main(String[] args) {
	swap.swapWithOutVariable(10,20);
	}

}
