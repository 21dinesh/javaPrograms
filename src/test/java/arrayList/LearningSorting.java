package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearningSorting {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(new GoodDay("Sunday","shiva",5));
		a.add(new GoodDay("Monday","Ganasha",4));
		a.add(new GoodDay("Tuesday","Balaji",1));
		a.add(new GoodDay("Wednesday","Chamundi",7));
			
//		Comparator c1=(o1,o2)->{
//			GoodDay g1=(GoodDay)o1;
//			GoodDay g2=(GoodDay)o2;
//			if(g1.num == g2.num) {
//				return 0;
//			}
//		else if (g1.num>g2.num)
//		return 1;
//		else
//				return -1;
//		};
//		System.out.println(a);
//		Collections.sort(a);
//		System.out.println(a);
		
		Comparator c2=(o1,o2)->{
			GoodDay g1=(GoodDay)o1;
			GoodDay g2=(GoodDay)o2;
			return g1.god.compareTo(g2.god);
		};
		System.out.println(a);
		Collections.sort(a,c2);
		System.out.println(a);
	}
}
