
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.width=5;
		r.setLength(10);
		System.out.println(r.area());
	RectangularPrism rp=new RectangularPrism();
	rp.height=5;
	rp.width=5;
	rp.setLength(5);
	System.out.println(rp.area());
	System.out.println(rp.volume());

	}

}
