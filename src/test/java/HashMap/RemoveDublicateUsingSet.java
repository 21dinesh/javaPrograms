package HashMap;
import java.util.LinkedHashSet;

public class RemoveDublicateUsingSet {
	public static void main(String[] args) {


		//dinesh first pull
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		String ip="aabbcaabbddee";
		for (int i=0; i<ip.length();i++) {
			set.add(ip.charAt(i));
			
		}
		for(char ch:set) {
			System.out.print(ch);
		}
	}

}
