
public class sphere extends shape{
	protected Double radius;
	final Double pie = 3.14;
	
	//Implementation of parameterized constructor
	public sphere(Double r) {
		this.radius = r;
		
	}
	
	//Implementation of a toString method
	public String toString() {
		return String.format("Sphere [Radius=%.2f, Surface Area=%.2f, Volume=%.2f]", 
		                             radius, surface_area(), volume());
	}
		 
	@Override
	public Double surface_area() {
		return(4 * pie * (radius *2));
		
	}

	@Override
	public Double volume() {
		return((4/3) * pie * (radius * 3));
		
	}

}
