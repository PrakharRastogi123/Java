import java.util.Scanner;

abstract class Shape{
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public abstract void calculatearea(float value);
	
}

class Circle extends Shape{
	@Override
	public void calculatearea(float value) {
		double area;
		area=3.14*value*value;
		System.out.println("Area of circle: "+area);
		
	}
}

class Square extends Shape{
		@Override
		public void calculatearea(float value) {
			double area;
			area=value*value;
			System.out.println("Area of Square: "+area);
			
		}
}



class ShapeMain{
	public static void main (String args[]) {
		System.out.println("Circle\nSquare\nEnter the Shape:");
		Scanner sc=new Scanner(System.in);
		String ch;
		float radius,side;
		ch=sc.next();
		if(ch.equals("Circle")) {
			System.out.println("enter radius of circle");
			radius=sc.nextFloat();
			Circle c=new Circle();
			c.calculatearea(radius);
		}
		else if(ch.equals("Square")) {
			System.out.println("enter the side:");
			side=sc.nextFloat();
			Square s=new Square();
			s.calculatearea(side);
		}
		else 
			System.out.println("INVALID CHOICE");
	}
}

