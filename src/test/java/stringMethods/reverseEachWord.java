package stringMethods;

public class reverseEachWord {
public static void main(String[] args) {
	String ip = "welcome to tp office";
	String[] words=ip.split(" ");
	StringBuilder reversedSentence =new StringBuilder();
	for (String word : words) { 
		StringBuilder reverseword = new StringBuilder(word);
		reverseword.append(reverseword.reverse().toString()).append(" ");
		
	}
	
	System.out.println();
	
}
}
