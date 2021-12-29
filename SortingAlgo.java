package Sorting;

public class SortingAlgo {

	public static void main(String[] args) {
		int[] a = { 1, 4, 10, 2, 5, 6 };
		// bubbleSort(a); // compare each element to next and swap if its greater
		// selectionSort(a);
		// insertionSort(a);
		mergeSort(a, 0, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	//O(nlogn) 
	/**
	 * First, split the arrays into left and right and then merge it back, merging is done using the sorting.
	 * its not memory efficient since it needs temp array to store.
	 * @param a
	 * @param start
	 * @param end
	 */
	private static void mergeSort(int[] a, int start, int end) {
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;

		mergeSort(a, start, mid);

		mergeSort(a, mid + 1, end);

		merge(a, start, mid, end);

	}

	private static void merge(int[] a, int start, int mid, int end) {
		if (a[mid - 1] <= a[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tempIndex = 0;
		int[] temp = new int[end - start];
		

		while (i < mid && j < end) {
			temp[tempIndex++] = a[i] <= a[j] ? a[i++] : a[j++];
		}

		//System.arraycopy(src, srcPos, dest, destPos, length);
		// copy the left over elements
		System.arraycopy(a, i, a, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, a, start, tempIndex);

	}

	/**
	 * O(n^2 but more memory efficient since no temp variable is used for swapping
	 * unsorted array starts from element 1, compare each element in unsorted array
	 * to all elements on its left until the end of array and shift the elements if
	 * its greater than
	 * 
	 * @param a
	 */
	private static void insertionSort(int[] a) {

		for (int lastUnSortedindex = 1; lastUnSortedindex < a.length; lastUnSortedindex++) {
			int newElement = a[lastUnSortedindex];
			int i;
			for (i = lastUnSortedindex; i > 0 && a[i - 1] > newElement; i--) {
				a[i] = a[i - 1]; // shifting greater element to right
			}

			a[i] = newElement; // move smaller to left
		}
	}

	// O(n^2) but less swapping than bubble sort
	// compare each element with largest, if greater than assign largest to that
	// number
	// and at the end of first pass swap last element with largest
	private static void selectionSort(int[] a) {

		int largest = 0;
		for (int lastUnSortedindex = a.length - 1; lastUnSortedindex > 0; lastUnSortedindex--) {
			for (int i = 1; i <= lastUnSortedindex; i++) {
				if (a[i] > a[largest]) {
					largest = i;
				}

			}
			swap(a, largest, lastUnSortedindex);
		}

	}

	// O(n^2)
	public static void bubbleSort(int[] a) {
		for (int lastUnSortedindex = a.length - 1; lastUnSortedindex > 0; lastUnSortedindex--) {
			for (int i = 0; i < lastUnSortedindex; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
				}

			}
		}

	}

	public static void swap(int a[], int i, int j) {
		if (i == j) {
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
