package arrayList;

public class GoodDay {
	String day;
	String god; 
	int num;

	public GoodDay(String day, String god, int num) {
		this.day = day;
		this.god = god;
		this.num = num;
	}
	public String toString() {
		return "[" + day + "," + god + "," + num + "]";

	}

}
