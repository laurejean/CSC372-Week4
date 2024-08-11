
public class cylinder extends shape{
	protected Double radius;
	protected Double height;
	final Double pie = 3.14;
	
	//Parameterized constructor
	public cylinder(Double r, Double h) {
		this.radius = r;
		this.height = h;
	}
	
	//Implementation of a toString method
	public String toString() {
		return String.format("Cylinder [Radius=%.2f, height =%.2f, Surface Area=%.2f, Volume=%.2f]", 
			                             radius, height, surface_area(), volume());
		}

	@Override
	Double surface_area() {
		return((2 * pie * radius * height) + (2 * pie * (radius * 2)));
	}

	@Override
	Double volume() {
		return (pie * (radius * 2) * height);
	}

}
