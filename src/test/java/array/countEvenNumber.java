package array;
import java.util.Arrays;
public class countEvenNumber {
	public static void main(String[] args) {
		int []a= {12,34,2,4,23,33,45,67,100};
		long num = Arrays.stream(a)
		.filter((n)-> n%2 == 0)
		.count();
		System.out.println(num);
		
		int[] evenNum=Arrays.stream(a)
				.filter(n-> n%2==0)
				.toArray();
		
		System.out.println(Arrays.toString(evenNum));
	}
}//using filter method we can find even number in array for that method we have to write the confition
//filter method is present in inStream class
//which accepts parameter as intpredicte functional interface referance
//inside that test(value) will return boolean where we have to provide the implementation
