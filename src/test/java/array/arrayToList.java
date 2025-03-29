package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayToList {
	public static void main(String[] args) {
		int [] a= {12,3,4,5,5,6};
		List<Integer> list= Arrays.stream(a)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
	}
	//program to convert int array to list using streams
}//why stream -> stream allow us to reduce the efforts and solve the program easily
//stram is countinuous flow of data which return a stream of data
//boxed() method will convert int[] array into integer array
//collect method will convert the stream of data into list and
//help to collect all the data and store it.
