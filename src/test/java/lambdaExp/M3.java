package lambdaExp;

import java.util.HashMap;


public class M3 {
	public static void main(String[] args) {
		HashMap hm= new HashMap<>();
		hm.put("Dinesh","Amazon");
		hm.put("Shivu","IBM");
		hm.put("Shabana","TY");
		hm.put("Sejal","IBM");
		
		hm.forEach((key,Value)->{
			
			System.out.println(key+":"+ Value);
		});
	}

}
