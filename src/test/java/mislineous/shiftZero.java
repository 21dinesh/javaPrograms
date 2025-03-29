package mislineous;

import static org.mockito.ArgumentMatchers.anyChar;

import java.util.Arrays;

import org.testng.annotations.Test;

public class shiftZero {
	
	@Test
public void shiftRight() {
		int a[]= {1,2,8,0,3,7,0,0,4,0};
		int b[]= new int [a.length] ;
		int n=0;
	    for (int i = 0; i < a.length-1; i++) {
	    	
	    	if(a[i]!=0) {
	    		b[n]=a[i];
	    
	    		n++;
	    	}

			
		}System.out.println(Arrays.toString(b));
	}
	@Test
	public void shiftLeft() {
		int a[]= {2,3,6,0,7,4,0,6,0};
        int b[]= new int [a.length];
        int n=a.length-1;
        for (int i = b.length-1;  i>=0 ; i--) {
			if(a[i]!=0) {
				b[n--]=a[i];
			
			}
		}System.out.println(Arrays.toString(b));
	
	}
}
