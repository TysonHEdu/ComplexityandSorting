package Application;

import shape.*;

public class Driver {

	public static void main(String[] args) {
		Shape shape;
		//shape = new Shape(10); can't instantiate because Shape is abstract
		
		Cone cone = new Cone(10,1);
		cone.getRadius();
		cone.getVolume();
		System.out.println(cone);
		
		Prism prism;
		//prism = new Prism(1, 2);
		
		//SquarePrism sp = new SquarePrism(10, 1); Should work later
	}
}
