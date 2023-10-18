package Utility;

import java.util.Comparator;

public class Sorts {
	public static <T extends Comparable<? super T>> void buubleSort(T[] arr)
	{
		int i, j; 
		T temp;
		boolean swapped = false;
		for (i = 0; i < arr.length- 1; i++) {
			swapped = false;
			for (j = 0; j <  arr.length - i - 1; j++) {
				//if (arr[j] > arr[j + 1]) {
				if (arr[j].compareTo(arr[j+1]) > 0)
				{
					// Swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// If no two elements were swapped by inner loop then break
			if (swapped == false)
				break;
		}
	}
	
	public static <T> void bubbleSort(T[] arr, Comparator<? super T> c)
	{
		int i, j; 
		T temp;
		boolean swapped = false;
		for (i = 0; i < arr.length- 1; i++) {
			swapped = false;
			for (j = 0; j <  arr.length - i - 1; j++) {
				//if (arr[j] > arr[j + 1]) {
				if (c.compare(arr[j], arr[j+1]) > 0)
				{
						
				
					// Swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j +1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// If no two elements were swapped by inner loop then break
			if (swapped == false)
				break;
		}
	}
}