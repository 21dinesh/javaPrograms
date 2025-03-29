package encapsulation;
class pen{
private String color;
	private int price;

	public void write() {
	}
	public void m1() {
		System.out.println(color);
		System.out.println(price);
	}
	
	public String getColor() {
	return color;
	}
	public int getPrice(){
		return price;
	}
	
	public String setColor() {
		color="blue";
		return color;
	}
	public static void main(String[] args) {
		pen p= new pen();
		String isColor=p.color;
		System.out.println(isColor);
	    
		String chagColor = p.setColor(); 

     
	}
}
