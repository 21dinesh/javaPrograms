package mislineous;

import java.util.Arrays;

public class removeDigit {
	public static void main(String[] args) {
		String str="hello12bye";
		for (int i = 0; i < str.length(); i++) {
			 str=str.replaceAll("[!^0-9]", "");
			
		}System.out.println(str);
	}

}
