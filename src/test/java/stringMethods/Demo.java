package stringMethods;

public class Demo  {
public static void main(String[] args) {
	String withSpace="I am Dinesh Kumar";
	String withOutSpace=withSpace.replace(" ", "");
	int lastIndex=withOutSpace.length()-1;
	for (int i = 0; i < withSpace.length(); i++) {
		if (withSpace.charAt(i)==' ') {
			System.out.print(" ");
		}
			else {
				System.out.print(withOutSpace.charAt(lastIndex--));
			}
		}
			
		
	}
	
}
	

