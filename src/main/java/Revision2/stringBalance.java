package Revision2;

import java.util.ArrayList;
import java.util.List;

public class stringBalance {
	public static void main(String[] args) {
		String s="({[{}]})";
		ArrayList<Character> list= new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(list.size()>=0 && 
					(ch=='}'&& list.get(list.size()-1)=='{')
					||(ch==']'&& list.get(list.size()-1)=='[')
					||(ch==')'&& list.get(list.size()-1)=='(')
					) {
				list.remove(list.size()-1);
			}else {
				list.add(ch);
			}
		}
		if(list.isEmpty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Not Balanced");
		}
		
	}

}
