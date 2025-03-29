package array;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StringIsBalance {
	public static void main(String[] args) {
		 String input= "{}[](){()[]}";
		 ArrayList<Character> al= new ArrayList<>();
		 for (int i=0;i<input.length();i++) {
			 if(al.size()>0 &&((input.charAt(i)=='}' && al.get(al.size()-1)=='{')
					 ||(input.charAt(i)==']'&& al.get(al.size()-1)=='[')
					 ||(input.charAt(i)==')'&& al.get(al.size()-1)=='('))){
				 al.remove(al.size()-1);
			 }else {
				 al.add(input.charAt(i));
			 }
			 
		 }
		 if(al.size()==0) {
			 System.out.println("string is balance");
		 }else
		 System.out.println("string is not balance");
	}

}
