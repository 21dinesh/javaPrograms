package abstraction;

public abstract class abstractGmail {
	abstract void sendMail(); 
}
class GmailImplimentation extends abstractGmail{
	public void sendMail() { 
		System.out.println("email is sent");
	} 
}	


