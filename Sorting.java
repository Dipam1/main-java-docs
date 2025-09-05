public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 3, 3,31, 3 };
        sumArray(arr);
	}
	
	public static void sumArray(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("Sum of array elements: " + sum);
	}

	public static void bubbleSortNoRepeat(int[] arr) {
		
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				if (arr[j] == arr[j + 1]) {
					// Shift elements to the left to remove duplicate
					for (int k = j + 1; k < n - 1; k++) {
						arr[k] = arr[k + 1];
					}
					n--; // Reduce the size of the array
					j--; // Stay at the same index to check the new element
				}
			}
			if (!swapped)
				break;
		}
		
	}
		
}