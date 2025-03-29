package ReverseArrayPro;

import java.util.HashSet;

public class SpecificSumofDigit {
	public static void main(String[] args) {
		
		int []s= {10,5,6,9,4,9,8,7};
		int targetSum=15;
		HashSet set= new HashSet();
		for(int i=0 ;i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i]+s[j]==targetSum) {
					String res=s[i]>s[j]?"("+s[j]+","+s[i]+")":"("+s[i]+","+s[j]+")";
					set.add(res);
				}
			}
			
		}
	System.out.println(set);	
	}

}
