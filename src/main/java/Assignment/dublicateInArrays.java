package Assignment;

import java.util.Arrays;
import java.util.List;

public class dublicateInArrays {
public static void main(String[] args) {
	Integer num[]= {12,3,4,5,6,5,4,3,2};
	  List<Integer> list = Arrays.asList(num);
	  for (int i = 0; i < list.size(); i++) {
		  Integer num2 = list.get(i);
		  if(list.indexOf(num2)!=list.lastIndexOf(num2)) {
			  System.out.println("num2 "+ num2);
			  list.set(i, null);
		  }
		
	}
}
}
