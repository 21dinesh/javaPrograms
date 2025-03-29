package collectionPrograms;

import java.util.ArrayList;

public class AddEleParticularIndex{
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("ecommers");
		list.add("HMS");
		list.add("ERP");
		list.add("CRM");
		
		System.out.println(list);
		list.add(0,"Banking");
		System.out.println(list);
	}

}
