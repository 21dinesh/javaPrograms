package lambdaExp;

import java.util.ArrayList;

public class ImplementingForEachLoop {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(12);
		list.add(10);
		list.add(8);
		list.add(11);
		//Consummer c=(a)->	
		list.forEach((a)->{
			
			if(a%2==0) {
				System.out.println("even");
			}else
				System.out.println("odd");
		});
	}//Lambda expression can be given as an input to another method in the traditional approach, 2
	//or3 implementation class has to be given but in class of lambda exp you can give the 
	//method implementation in the runner class
}

