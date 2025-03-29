package Revision2;

public class ReverEachWord {
	public static void main(String[] args) {
		String s="welcome to the programming word";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			StringBuilder builder=new StringBuilder(s1);
			System.out.print(builder.reverse()+" ");
			
		}
	}

}
