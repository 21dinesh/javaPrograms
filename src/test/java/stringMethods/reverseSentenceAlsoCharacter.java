package stringMethods;

public class reverseSentenceAlsoCharacter {
	public static void revSenAlChar(String str) {
		String strArray[]=str.split(" ");
		int n = strArray.length;
		
        for (int i = 0; i < n; i++) {	
		int wrdLnth = strArray[i].length();
		for (int j = wrdLnth; j>0 ; j--) {
			int k=j-1;
			System.out.print(strArray[i].charAt(k));
		}
		System.out.print( " ");
        }	
	}
	
	public static void main(String[] args) {
		String str = "welcome to tp office";
		System.out.println(str);
		revSenAlChar(str);
	}

}
