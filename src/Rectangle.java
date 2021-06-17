
public class Rectangle {
private int length;
protected int width;

public int area() {
	return getLength()*width;
}
public int perimeter() {
	return 2*(getLength()+width);
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
}
