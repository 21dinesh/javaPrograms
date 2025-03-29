package collectionPrograms;

import java.util.ArrayList;

public class addingListAtArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("masterChif");
		list.add("SaReGaMaPa");
		list.add("DKD");
		list.add("KBC");
		
		ArrayList list1= new ArrayList();
		list1.add("sanjiv kapur");
		list1.add("shreelashmi");
		list1.add("appu");
		list1.add("amit");
		list.add(list1);
		 
		System.out.println(list);
	}

}
