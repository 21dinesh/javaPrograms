package Revision2;

public class reverseWithoutReplaysSpace {
	public static void main(String[] args) {
		String s="Virat is a Batsman";

		String StringWithoutSpace = s.replace(" ", "");
		
		int last=StringWithoutSpace.length()-1;
		
		for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i)==' ') {
          System.out.print(" ");   	 
         }else
         System.out.print(StringWithoutSpace.charAt(last--));
		 }
	
	}
}
