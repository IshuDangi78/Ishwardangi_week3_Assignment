package Week3;

 abstract class Shape
{
	 public abstract double calculateArea();
}
 class Circle extends Shape
 {
	private double radius;

	public Circle(double radius) 
	{
		
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}
 } 
 class Rectangle extends Shape
 {
	 private double length;
	 private double width;
	 
	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		
		return length*width;
	}
	 
 }
 class Tringle extends Shape
 {
	 private double base;
	 private double height;
	 
	public Tringle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height ;
	}
	 
 }
 
public class Main1 {

	public static void main(String[] args) 
	{
		Shape circle=new Circle(7);
		Shape rectangle=new Rectangle(5, 20);
		Shape tringle = new Tringle(5, 10);
		
		System.out.println("Area of circle : "+circle.calculateArea());
		System.out.println("Area of rectangle : "+rectangle.calculateArea());
		System.out.println("Area of tringle : "+tringle.calculateArea());
	}

}
