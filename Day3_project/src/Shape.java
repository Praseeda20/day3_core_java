
public abstract class Shape {
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private int radius;
	private String type;

	public Shape() {}

	public Shape(int radius, String type) {
		this.radius = radius;
		this.type=type;
	}
	public void drawShape()
	{
		System.out.println(type+" Shape drawn with red colour");
	}
	public abstract float calcArea(); 
	public abstract float calcVolume(); 
	
	public String toString() {
		return "Shape [radius=" + radius + "]";
	}
	
}
