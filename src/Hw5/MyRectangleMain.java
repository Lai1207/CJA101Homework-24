package Hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle();
		MyRectangle r2 = new MyRectangle(10,20);
		r1.setDepth(20);
		r1.setWidth(10);
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		
	}
	
	
}
