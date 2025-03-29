package capitalFirstandlast;
public class capFirstAndLast {
	
	public static StringBuilder capitalize(String str) {
		
		String[] words = str.split(" ");
		StringBuilder result =new StringBuilder();
		
		for (int i=0;i<words.length;i++) {
			String word =words[i];
			if (word.length()>0) {
				 result = result.append( Character.toUpperCase(word.charAt(0))+word.substring(1));				
			}
		if(i<words.length-1) {
			result.append("");
		}
		}
		return result;
	}
	public static void main(String[] args) {
		String str="i am from tp";
		System.out.println(str);
		StringBuilder res=capitalize(str);
		System.out.println(res);
	}

}
