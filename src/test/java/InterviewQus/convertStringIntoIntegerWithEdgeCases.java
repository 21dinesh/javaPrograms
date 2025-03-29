package InterviewQus;

public class convertStringIntoIntegerWithEdgeCases {
	public static void main(String[] args) {
		String s="asdv";
		try {
			if(s==null||s.isEmpty()) {
				throw new IllegalArgumentException("String is Null or Empty");
			}
			int result=0;
			int sign=1;
			int startIndex=0;
		if(s.charAt(0)=='-') {
			sign=-1;
			startIndex=1;
		}
		for (int i = startIndex; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch<'0' || ch>'9') {
				throw new IllegalArgumentException("String is Invalid");
			}
			result=result*10+(ch-48);
			
		}
		result=result*sign;
		System.out.println("converted number "+result);
		
		
	}catch(Exception e) {
		System.out.println("error is "+e.getMessage());
	}
	}
}
