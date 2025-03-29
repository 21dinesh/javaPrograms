package array;

import java.util.Arrays;

public class sumTwoArray {
	public static void main(String[] args) {

   int[]a= {1,2,3};
   int []b = {2,3,3,5};
   int sum[]=new int[Math.max(a.length, b.length)];
   for(int i=0;i<sum.length;i++) {
	   if(i<a.length) {
	     sum[i]+=a[i];
       }
     if(i<b.length) {
    	 sum[i]+=b[i];
     }
	}
	System.out.println(Arrays.toString(sum));
	}
}
