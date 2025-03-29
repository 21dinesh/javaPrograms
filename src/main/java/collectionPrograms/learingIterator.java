package collectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class learingIterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("selenium");
		list.add("Apache POI");
		list.add("GitHub");
		list.add("TestNG");
		
		Iterator itr= list.iterator();
		
		while(itr.hasNext()){
       System.out.println(itr.next());			
		}
	}

}
