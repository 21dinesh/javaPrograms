package polymorphism;

import polymorphism.WorkinOnPolymorphism.Whatsapp1;
import polymorphism.WorkinOnPolymorphism.Whatsapp2;

public class DriverClass {

	public static void main(String[] args) {

		WorkinOnPolymorphism wopm = new WorkinOnPolymorphism();
		Whatsapp1 wa1 = wopm.new Whatsapp1(); 
		wa1.videocall();

		Whatsapp2 wa2 = wopm.new Whatsapp2();
		wa2.videocall();

		Whatsapp1 wa3 = wopm.new Whatsapp2();
		wa3.videocall();
	}

}
