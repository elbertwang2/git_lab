package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
		int n = array.length;
		boolean swapped = true;
		while (swapped == true) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (array[i-1] > array[i]) {
					arraySwap(i-1, i, array);
					swapped = true;
				}	  
		    }
	    }
	    return array;
	}
}
