package Assignment;

public class genrateAllSubstringGraterthen2 {
	public static void main(String[] args) {
		String s="sum";
		for (int i = 0; i <= s.length(); i++) {
		  for (int j = i+2; j <= s.length(); j++) {
			System.out.print(s.substring(i,j)+" ");
		}
		}
	}

}
