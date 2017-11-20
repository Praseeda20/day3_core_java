public class Sphere extends Shape{
	
	
	public Sphere() {
	}

	public Sphere(int radius) {
		super(radius," Sphere");
	}
	
	@Override
	public float calcArea() {
		return (float)(4*Math.PI*getRadius()*getRadius());
	}

	@Override
	public float calcVolume() {
		return (float)(4/3*Math.PI*Math.pow(getRadius(),3));		
	}	

	
}
