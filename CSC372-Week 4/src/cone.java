
public class cone extends shape{
	protected Double radius;
	protected Double height;
	final Double pie = 3.14;
	
	public cone(Double r, Double h) {
		this.radius = r;
		this.height = h;
	}
	
	//Implementation of a toString method
		public String toString() {
			return String.format("Cone [Radius=%.2f, height =%.2f, Surface Area=%.2f, Volume=%.2f]", 
				                             radius, height, surface_area(), volume());
			}

	@Override
	Double surface_area() {
		return(pie * radius * (radius + Math.sqrt((height * 2) + (radius * 2))));
	}

	@Override
	Double volume() {
		return (pie*(radius * 2) * (height /3));
	}
	
}


