public class Main
{
	public static void main(String[] args) {
	    System.out.println("----Recipe for Whisky----");
		Beverage b=new Whisky();
		b.templateMethod(30);
		System.out.println("  ");
		System.out.println("----Recipe for Beer----");
		b=new Beer();
		b.templateMethod(200);
	}
}
