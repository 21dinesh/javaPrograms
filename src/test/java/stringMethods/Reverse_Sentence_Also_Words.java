package stringMethods;

public class Reverse_Sentence_Also_Words {

	public static void main(String[] args) {

		String str1 = "I am from Tek Pyramid";
		String str2 = "";

		String[] result = str1.split(" ");

		for (int i = result.length - 1; i >= 0; i--) {

			String str3 = result[i];
			for (int j = str3.length() - 1; j >= 0; j--) {

				str2 = str2 + str3.charAt(j);

			}

			str2 = str2 + " ";

		}
		System.out.println(str2.trim());
	}
}
