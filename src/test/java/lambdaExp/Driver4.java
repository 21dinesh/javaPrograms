package lambdaExp;

public class Driver4 {
	public static void main(String[] args) {
	i4 i=(a,b)->{
		System.out.println(a);
		System.out.println(b);
		return a+b;
		};
	System.out.println(i.add(49, 304));
}

}
