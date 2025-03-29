package array;
import java.util.Arrays;
public class shiftLeftArray {
	public static void main(String[] args) {
		String str="my name is dinesh";		
		String[] arr = str.split(" ");
		
		
		for (int i=0; i<3;i++) {
			String temp=arr[0];
			for (int j=0; j<arr.length-1;j++) {
			arr[j]=arr[j+1];
			}
		    arr[arr.length-1]=temp;
		}
			System.out.println(Arrays.toString(arr));
			
		}
	}


