package InterviewQus;

import java.util.ArrayList;
import java.util.Arrays;


public class getNextMax {
	public static void main(String[] args) {
//		ArrayList<Integer> s= new ArrayList<Integer>();
//		int ran=Random r=new Random(10);
//		s.add(ran);
		int a[]= {1,9,3,7,5,6,4,2};
//		Arrays.sort(a);
//		System.out.println(a.length +a.length-2);
		
		int sum=0, m=0,n=0;
			
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
			if (a[i]+a[j]>sum)
			{
				sum=a[i]+a[j];
				m=a[i];
				n=a[j];
			}
		}
	}System.out.println(sum+" "+m+" "+n );
		}
}
