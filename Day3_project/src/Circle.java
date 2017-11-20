
public class Circle extends Shape{

	public Circle() {
	}

	public Circle(int radius) {
		super(radius,"Circle");
	}
	@Override
	public float calcArea() {
		return (float)(Math.PI*getRadius()*getRadius());
	}

	@Override
	public float calcVolume() {
		return (float)(2*Math.PI*getRadius());		
	}	

}
