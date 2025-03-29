package stringMethods;

import org.testng.annotations.Test;

public class continueLargeSum {
	@Test
	public  void test() {
		int[] a= {0,5,0,9,1,4};
		int large=0,c=0,b=0;
			for (int j = 0; j < a.length-1; j++) {
			
			if (a[j]+a[j+1]>large) {
				large=a[j]+a[j+1];
				c=a[j];
				b=a[j+1];
				
				}
			}
			System.out.println(c +"+"+b+"="+large);
			
			
		}
	}
