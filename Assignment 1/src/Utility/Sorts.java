package Utility;
import java.util.Arrays;
import java.util.Comparator;

public class Sorts {
	public static <T extends Comparable<? super T>> void bubbleSort(T[] arr)
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

	public static <T extends Comparable<? super T>> void insertionSort(T[] arr)
    {
            int n = arr.length;
            for (int i = 1; i < n; i++)
            {
                T shapeValue = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].compareTo(shapeValue) > 0)
                {
                    arr[j + 1] = arr[j];
                    j--;
                }
                
                arr[j + 1] = shapeValue;
            }
    }
    
    public static <T> void insertionSort(T[] arr, Comparator<? super T> comparator)
    {
        int n = arr.length;
        for (int i = 1; i < n; i++)
        {
            T shapeValue = arr[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(arr[j], shapeValue) > 0)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = shapeValue;
        }
    }
    

    public static <T extends Comparable<? super T>> void selectionSort(T[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (arr[j].compareTo(arr[min]) < 0)
                {
                    min = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static <T> void selectionSort(T[] arr, Comparator<? super T> comparator)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (comparator.compare(arr[j], arr[min]) < 0)
                {
                    min = j;
                }
            }
            T temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static <T extends Comparable<? super T>> void mergeSort(T[] arr) {
        int length = arr.length;
        if (length <= 1)
            return;

        int middle = length / 2;
        T[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        T[] rightArr = Arrays.copyOfRange(arr, middle, length);

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static <T extends Comparable<? super T>> void merge(T[] leftArr, T[] rightArr, T[] arr)
    {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize)
        {
            if (leftArr[l].compareTo(rightArr[r]) < 0) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize)
        {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightSize)
        {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }

    public static <T> void mergeSort(T[] arr, Comparator<? super T> comparator)
    {
        int length = arr.length;
        if (length <= 1) return;

        int middle = length / 2;
        T[] leftArr = Arrays.copyOfRange(arr, 0, middle);
        T[] rightArr = Arrays.copyOfRange(arr, middle, length);

        mergeSort(leftArr, comparator);
        mergeSort(rightArr, comparator);
        merge(leftArr, rightArr, arr, comparator);
    }

    private static <T> void merge(T[] leftArr, T[] rightArr, T[] arr, Comparator<? super T> comparator)
    {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize)
        {
            if (comparator.compare(leftArr[l], rightArr[r]) < 0)
            {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize)
        {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightSize)
        {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
    

    public static class QuickSort {
        public static <T extends Comparable<? super T>> void quickSort(T[] arr) {
            qSort(arr, 0, arr.length - 1);
        }

        private static <T extends Comparable<? super T>> void qSort(T[] arr, int posA, int posB) {
            if (posA < posB) {
                int separate = partElem(arr, posA, posB);
                qSort(arr, posA, separate - 1);
                qSort(arr, separate + 1, posB);
            }
        }

        private static <T extends Comparable<? super T>> int partElem(T[] arr, int posA, int posB) {
            T separateValue = arr[posB];
            int i = posA - 1;
            for (int j = posA; j < posB; j++) {
                if (arr[j].compareTo(separateValue) < 0) {
                    i++;
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            T temp = arr[i + 1];
            arr[i + 1] = arr[posB];
            arr[posB] = temp;
            return i + 1;
        }

    public class QuickSortC<T extends Comparable<? super T>> implements Comparator<T>
    {
        @Override
        public int compare(T o1, T o2) {
            return o1.compareTo(o2);
        }
    }

    //insert custom sort here (which we don't have at the moment)
    public static <T extends Comparable<? super T>> void customSort(T[] arr, Comparator<T> comparator)
    {
        
    }


}
}
