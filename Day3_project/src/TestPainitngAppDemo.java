public class TestPainitngAppDemo {

	public static void main(String[] args) {
		Shape shape1=new Circle(6);
		Shape shape2=new Sphere(6);
		
		shape1.drawShape();
		shape2.drawShape();
		System.out.println("Area of Shape1: "+shape1.calcArea());
		System.out.println("Area of Shape2: "+shape2.calcArea());
		
		System.out.println("Circumference of Shape1: "+shape1.calcVolume());
		System.out.println("Volume of Shape2: "+shape2.calcVolume());
		
	}

}
