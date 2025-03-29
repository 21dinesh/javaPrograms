package stringMethods;

public class substringCount {
	public static void main(String[] args) {
		String str="seljavaselpythonselsel";
		String s1="sel";
		int count=0;
		for (int i = 0; i <= str.length()-s1.length(); i++) {
			String result = str.substring(i,i+s1.length());
			if(s1.equals(result)) {
				count++;
			}
			
		}System.out.println(count);
	}

}
