package abInterface;

public interface AbProject {
	public abstract void project();

}
class HP implements AbProject{
	public void project() {
		System.out.println("hp projection");
	}
}
class Dell implements AbProject {
	public void project() {
		System.out.println("Dell projection");
	}
}
