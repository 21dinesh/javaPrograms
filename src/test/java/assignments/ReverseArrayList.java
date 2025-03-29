package assignments;

import java.util.ArrayList;

public class ReverseArrayList {
public static void main(String[] args) {
	ArrayList<StringBuilder> aL= new ArrayList<>();
	
	aL.add(new StringBuilder("Hi"));
	aL.add(new StringBuilder("there"));
	aL.add(new StringBuilder("whats up"));
	System.out.println(aL);
	
	
	aL.forEach((sb)->{
		(sb).reverse();
		System.out.print(sb+" ");
	});
}

}
