package Revision;

public class reverseWordAndCharactor {
	public static void main(String[] args) {
		
		        String s = "welcome to India";
		        String[] words = s.split(" ");
		        StringBuilder sb = new StringBuilder();

		        for (int i = words.length - 1; i >= 0; i--) {
		            sb.append(new StringBuilder(words[i]).reverse()).append(" ");
		        }

		        System.out.println("Reversed words and characters: " + sb.toString().trim());
		    }

	}


