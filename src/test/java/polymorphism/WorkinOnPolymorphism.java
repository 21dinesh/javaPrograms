package polymorphism;

public class WorkinOnPolymorphism {

	public class Whatsapp1 {
		public void videocall() {
			System.out.println("can call 6 people");
		}

	}

	public class Whatsapp2 extends Whatsapp1 {
		public void videocall() {
			System.out.println("you can share screen");

		}
	}

}


