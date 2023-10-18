package Application;

import Utility.BaseAreaComparator;
import Utility.Sorts;
import Utility.VolumeComparator;
import shape.Shape;

public class SortManager {
	private String fileName;
	private char compareType;
	private char sortType;
	private Shape[] shapes;

	public SortManager(String[] args)
	{
		if(args[0].toLowerCase().startsWith("-f"))
		{
			fileName = args[0].substring(2);
		}
		else if (args[1].toLowerCase().startsWith("-f"))
		{
			fileName = args[1].substring(2);
		}
		else if (args[2].toLowerCase().startsWith("-f"))
		{
			fileName = args[2].substring(2);
		}
		if (args[0].toLowerCase().startsWith("-t"))
		{
			compareType = args[0].substring(2).charAt(0);
		}
		//..........
		
		fillShapesArray();
		sortShapes();
		//printSortedShapes();
	}

	private void sortShapes() {
		if(sortType == 'B' || sortType == 'b')
		{
			if(compareType == 'H' || compareType == 'h')
			{
				Sorts.bubbleSort(shapes, new BaseAreaComparator());
			}
			else if (compareType == 'V' || compareType == 'v')
			{
					Sorts.bubbleSort(shapes, new VolumeComparator());
			}
		}
		
	}

	private void fillShapesArray() {
		// read from data file and populate the shapes array
		//shapes = new Shape[the first value from file];
		
	}
	
}
