package collection;

import java.util.ArrayList;

public class ArrayList_Collection_Methods {
	public static void main(String[] args) {
		ArrayList aL= new ArrayList<>();
		aL.add("orange");
		aL.add("banana");
		aL.add("kivi");
		aL.add("mango");
		System.out.println(aL.isEmpty()+ " arrayList is not Empty"); //false
		
		ArrayList aL2= new ArrayList();
		aL2.add("rose");
		aL2.add("lily");
		aL2.add("jessmin");
		
		aL.addAll(aL2);

		System.out.println("The size of arrey List is "+aL.size());		
		System.out.println(aL);
		
		System.out.println("===========remove, retain, contain==========");
		
		aL.remove(0);
		System.out.println(aL);
		
		aL.retainAll(aL2);
		System.out.println(aL2);//common between al1 and al2
	}

}
