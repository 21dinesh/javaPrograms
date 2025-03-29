package stringMethods;

public class reverseSentense {
	
	public static String reversewords(String sent) {
		String [] strArray = sent.split(" ");
		String revSent="";
		for (int i = strArray.length-1; i >=0 ; i--) {
				if(i==0)
					revSent=revSent+strArray[i];
				else {	
					revSent=revSent+strArray[i]+" ";	
			}
		}
		return revSent; 
	}
	public static void main(String[] args) {
		String str="I AM FROM TP";
		String revsentence=reversewords(str);
		System.out.println(revsentence);
	}

}
