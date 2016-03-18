package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//DONE: S2 implements insertion sort
		
        int length = unsortedArray.length;
            for (int i = 0; i < length; i++) {
                int x = unsortedArray[i];
                int j = i - 1;
                while (j >= 0 && unsortedArray[j] > x) {
                    unsortedArray[j + 1] = unsortedArray[j];
                    j--;
                }
                unsortedArray[j + 1] = x;
            }
        return unsortedArray;
	}
}
