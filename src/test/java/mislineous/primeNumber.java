package mislineous;

public class primeNumber {
	public static void main(String[] args) {
		int n=15;
		int m=n;
		int num=2;
		while(n>0) {
			int count=getCount(num);
			if(count==2) {
				System.out.println(num);
				n--;
			}num++;
		}
	System.out.println("first "+m + " prine number");
}	
	

	private static int getCount(int num) {
		int count=0;
		for (int i = 1; i <=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}

}
