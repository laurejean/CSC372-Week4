import java.util.ArrayList;

public class ShapeArray {

	public static void main(String[] args) {
		
	//Creation of a array list
		ArrayList<String>shapeArray = new ArrayList<String>();
		
		sphere s1 = new sphere(2.00);
		cylinder c1 = new cylinder(4.00, 6.00); 
		cone co1 = new cone(6.00, 8.00);
		
	//Storing instantiation into an array list
	shapeArray.add("s1");
	shapeArray.add("c1");
	shapeArray.add("co1");
	
	//Looping trough array to print the instance data
	for(String list:shapeArray) {
		System.out.println(list);
		
	}

	}

}
