package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Use_Iterator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.add("R");
		list.add("J");
		list.add("L");
		list.add("Lotus");
		 
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(((String)itr.next()).length());	
			
		}
	}

}
