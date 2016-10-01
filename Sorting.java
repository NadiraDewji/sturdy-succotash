import java.util.Arrays;
/**
 * In-class notes / demo on selection sort
 * and bubble sort.
 */

public class Sorting {
	public static void main(String[] args) {
		int[] unsorted = {3, 1, 5, 2};
		System.out.println(Arrays.toString(unsorted));
		
		// UNCOMMENT to run buble sort
		//bubbleSort(unsorted);
		selectionSort(unsorted);
		
		// now it's sorted YES!!!
		System.out.println(Arrays.toString(unsorted));
	}
	
	// change the array in place
	// (it doesn't return anything)
	public static void bubbleSort(int[] numbers){ 
		boolean swap = true;
		while(swap) {
			swap = false;
			// go through every position except the last one
			for(int i = 0; i < numbers.length - 1; i++) {
				if(numbers[i] > numbers[i + 1]) {
					// SWAP!
					int old_numbers_i = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = old_numbers_i;
					// DON'T JUST DO THIS: numbers[i] = numbers[i + 1];
					// numbers[i] ===> 12
					// numbers[i + 1] ===> 24
					// numbers[i] = numbers[i + 1];
					// numbers[i] ===> 24
					// numbers[i + 1] = numbers[i]
					// nubmers[i + 1] ===> 24
					swap = true;
				}
			}
		// as long as no swaps have occurred
		// go through every position
		// if the next element is smaller
		// swap
		// keep track of swap
		}
		
	}
	public static void selectionSort(int[] numbers) {
		// there are two parts the array - sorted and unsorted
		// consider the 1st element of the unsorted as the min
		// ... find the smallest in the remainder to swap with it
		// move to the partition of sorted / unsorted
		
		// this moves the partition between sorted and unsorted
		for(int i = 0; i < numbers.length; i++) {
			// min is the index of what we think is the smallest
			int min = i;
			// find the smallest value (set min to that index)
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < numbers[min]) {
					min = j;
				}	
			}
			if(min != i) {
				// swap here
				int tmp = numbers[min];
				numbers[min] = numbers[i];
				numbers[i] = tmp;
			}
		}
	}
}
