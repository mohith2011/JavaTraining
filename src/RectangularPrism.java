
public class RectangularPrism extends Rectangle{
protected int height;
public int area() {
	return 2*((getLength()*width)+(width*height));
} 
public int volume() {
	return getLength()*width*height;
}
}
