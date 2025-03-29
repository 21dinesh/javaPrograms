package mislineous;

public class reverseNumber {
public static void main(String[] args) {

	int n=1234, rev=0, i=0;
	while (n!=0) {
		i=n%10;
		rev=rev*10+i;
		n=n/10;
		
		
	}System.out.println(rev);
}

}

