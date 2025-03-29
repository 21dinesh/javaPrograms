package stringMethods;

public class Printing_a2b2c1d1 {
	public static void main(String[] args) {
	String ip="a2b2a2c1d3";
	for (int i=0; i<ip.length();i=i+2) {
		char alpha=ip.charAt(i);
		int count=ip.charAt(i+1)-48;
		for(int j=1;j<=count;j++) {
		
		System.out.print(alpha);
	    }
		}
	}
}

