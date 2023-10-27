package Utility;

import java.util.Comparator;

import shape.Shape;

public class VolumeComparator implements Comparator<Shape> {

	public int compare(Shape s1, Shape s2) {
		if(s1.getVolume()> s2.getVolume())
			return 1;
		else if (s1.getVolume()< s2.getVolume())
			return -1;
		return 0;
	}

}
