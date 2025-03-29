  package stringMethods;

public class revrseWithSameSpace {
	public static void main(String[] args) {
		String withSpace="I Love Veg Biriyani";
		String withOutSpace= withSpace.replace(" ","");
		int lastIndex=withOutSpace.length()-1;
		for (int i = 0;i<withSpace.length();i++) {
			if (withSpace.charAt(i)==' ') {
				System.out.print(" ");
			}else {
				System.out.print(withOutSpace.charAt(lastIndex--));
			}
		}
	}
}
