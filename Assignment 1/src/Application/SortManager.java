package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Utility.BaseAreaComparator;
import Utility.VolumeComparator;
import shape.*;

public class SortManager {
    private String fileName;
    private char compareType;
    private char sortType;
    private Shape[] shapes;

    public SortManager(String[] args)
    {
        fileName = "";
        compareType = ' '; // Will be the default value
        sortType = 'B'; //will be the default value


        for (String arg : args) {
            if (arg.toLowerCase().startsWith("-f")) {
                fileName = arg.substring(2);
            } else if (arg.toLowerCase().startsWith("-t")) {
                compareType = arg.charAt(2);
            } else if (arg.toLowerCase().startsWith("-s")) {
                sortType = arg.charAt(2);
            }
        }

        fillShapesArray();
        sortShapes();
    }

    private void sortShapes() {
        if (sortType == 'B' || sortType == 'b') {
            if (compareType == 'H' || compareType == 'h') {
                bubbleSort(shapes, new BaseAreaComparator());
            } else if (compareType == 'V' || compareType == 'v') {
                bubbleSort(shapes, new VolumeComparator());
            }
        } else if (sortType == 'I' || sortType == 'i') {
            if (compareType == 'H' || compareType == 'h') {
                insertionSort(shapes, new BaseAreaComparator());
            } else if (compareType == 'V' || compareType == 'v') {
                insertionSort(shapes, new VolumeComparator());
            }
        } else if (sortType == 'S' || sortType == 's') {
            if (compareType == 'H' || compareType == 'h') {
                selectionSort(shapes, new BaseAreaComparator());
            } else if (compareType == 'V' || compareType == 'v') {
                selectionSort(shapes, new VolumeComparator());
            }
        } else if (sortType == 'M' || sortType == 'm') {
            if (compareType == 'H' || compareType == 'h') {
                mergeSort(shapes, new BaseAreaComparator());
            } else if (compareType == 'V' || compareType == 'v') {
                mergeSort(shapes, new VolumeComparator());
            }
        } else if (sortType == 'Q' || sortType == 'q') {
            if (compareType == 'H' || compareType == 'h') {
                quickSort(shapes, new BaseAreaComparator());
            } else if (compareType == 'V' || compareType == 'v') {
                quickSort(shapes, new VolumeComparator());
            }
        }
    }

	private void fillShapesArray()
	{
		try (BufferedReader reader = new BufferedReader(new FileReader("polyNameBIG.txt")))
		{
			int shapeFound = Integer.parseInt(reader.readLine().trim());
			shapes = new Shape[shapeFound];

			for (int i = 0; i < shapeFound; i++) {
				String line = reader.readLine();
				String[] parts = line.split(" ");
				String shapeType = parts[0];
				double radius = Double.parseDouble(parts[1]);
				double sideLength = Double.parseDouble(parts[2]);
				double height = Double.parseDouble(parts[3]);
				Shape shape = null;

				if (shapeType.equals("Cylinder")) {
					shape = new Cylinder(radius);
				} else if (shapeType.equals("OctagonalPrism")) {
					double sideLength = Double.parseDouble(parts[2]);
					double height = Double.parseDouble(parts[3]);
					shape = new OctagonalPrism(sideLength, height);
				} else if (shapeType.equals("PentagonalPrism")) {
					double sideLength = Double.parseDouble(parts[2]);
					double height = Double.parseDouble(parts[3]);
					shape = new PentagonalPrism(sideLength, height);
				} else if (shapeType.equals("Cone")) {
					double radius = Double.parseDouble(parts[2]);
					double height = Double.parseDouble(parts[3]);
					shape = new Cone(radius);
				} else if (shapeType.equals("SquarePrism")) {
					double sideLength = Double.parseDouble(parts[2]);
					double height = Double.parseDouble(parts[3]);
					shape = new SquarePrism(sideLength, height);
				} else if (shapeType.equals("TriangularPrism")) {
					double sideLength = Double.parseDouble(parts[2]);
					double height = Double.parseDouble(parts[3]);
					shape = new TriangularPrism(sideLength, height);
				} else {
					System.out.println("Unknown shape type: " + shapeType);
				}

				shapes[i] = shape;
			}

		} catch (IOException e) {
			e.printStackTrace();
			// Handle any IO exceptions here.
		}
	}

}

