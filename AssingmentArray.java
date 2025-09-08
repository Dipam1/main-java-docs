import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class AssignmentArray {

    // Helper method to get an integer array from user input
    private int[] getIntArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Helper method to get a string array from user input
    private String[] getStringArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
        }
        return arr;
    }

    // 1. Calculate the average value of an array
    public void calculateAverage() {
        int[] arr = getIntArrayInput();
        double sum = 0;
        for (int value : arr) {
            sum += value;
        }
        double average = sum / arr.length;
        System.out.println("The average value of the array is: " + average);
    }

    // 2. Test if an array contains a specific value
    public void containsValue() {
        int[] arr = getIntArrayInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to search for: ");
        int valueToFind = scanner.nextInt();
        boolean found = false;
        for (int value : arr) {
            if (value == valueToFind) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The array contains the value " + valueToFind);
        } else {
            System.out.println("The array does not contain the value " + valueToFind);
        }
    }

    // 3. Find the index of an array element
    public void findIndex() {
        int[] arr = getIntArrayInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to find the index of: ");
        int valueToFind = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToFind) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The index of " + valueToFind + " is: " + index);
        } else {
            System.out.println(valueToFind + " not found in the array.");
        }
    }

    // 4. Remove a specific element from an array
    public void removeElement() {
        int[] arr = getIntArrayInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int value : arr) {
            if (value != elementToRemove) {
                list.add(value);
            }
        }

        int[] newArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArr));
    }

    // 5. Find the maximum and minimum value of an array
    public void findMaxAndMin() {
        int[] arr = getIntArrayInput();
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    // 6. Reverse an array of integer values
    public void reverseArray() {
        int[] arr = getIntArrayInput();
        System.out.println("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    // 7. Find the duplicate values of an array of integer values
    public void findDuplicateIntegers() {
        int[] arr = getIntArrayInput();
        System.out.println("Duplicate values are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }
    
    // 8. Find the duplicate values of an array of string values
    public void findDuplicateStrings() {
        String[] arr = getStringArrayInput();
        System.out.println("Duplicate values are: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }
    
    // 9. Find common elements between two string arrays
    public void findCommonElements() {
        System.out.println("Enter first array:");
        String[] arr1 = getStringArrayInput();
        System.out.println("Enter second array:");
        String[] arr2 = getStringArrayInput();
        
        Set<String> set = new HashSet<>();
        for(String val : arr1) {
            set.add(val);
        }
        
        System.out.println("Common elements are:");
        for(String val : arr2) {
            if(set.contains(val)) {
                System.out.print(val + " ");
            }
        }
        System.out.println();
    }
    
    // 10. Remove duplicate elements from an array
    public void removeDuplicates() {
        int[] arr = getIntArrayInput();
        Set<Integer> set = new HashSet<>();
        for(int val : arr) {
            set.add(val);
        }
        System.out.println("Array after removing duplicates: " + set);
    }
    
    // 11. Find the second largest element in an array
    public void findSecondLargest() {
        int[] arr = getIntArrayInput();
        Arrays.sort(arr);
        System.out.println("Second largest element is: " + arr[arr.length - 2]);
    }

    // 12. Find the second smallest element in an array
    public void findSecondSmallest() {
        int[] arr = getIntArrayInput();
        Arrays.sort(arr);
        System.out.println("Second smallest element is: " + arr[1]);
    }
    
    // 13. Separate even and odd numbers in an array
    public void separateEvenAndOdd() {
        int[] arr = getIntArrayInput();
        int left = 0, right = arr.length - 1;
        while(left < right) {
            while(arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while(arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Array with even numbers first: " + Arrays.toString(arr));
    }
    
    // 14. Find the k largest elements in a given array
    public void findKthLargest() {
        int[] arr = getIntArrayInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(k + " largest elements are:");
        for(int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // 15. Find the k smallest elements in a given array
    public void findKthSmallest() {
        int[] arr = getIntArrayInput();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(k + " smallest elements are:");
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 16 & 26. Swap two arrays with a temporary variable.
    public void swapTwoArrays() {
        System.out.println("Enter first array:");
        int[] arr1 = getIntArrayInput();
        System.out.println("Enter second array (must be same size):");
        int[] arr2 = getIntArrayInput();
        
        if (arr1.length != arr2.length) {
            System.out.println("Arrays must be of the same size to swap.");
            return;
        }

        System.out.println("Before swap:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("After swap:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }

    // 17 & 27. Swap three numbers/arrays with a temporary variable.
    public void swapThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        System.out.println("Before swap: a=" + a + ", b=" + b + ", c=" + c);
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println("After swap: a=" + a + ", b=" + b + ", c=" + c);
    }
    
    // 18. Copy all elements of one array into another array
    public void copyArray() {
        int[] sourceArr = getIntArrayInput();
        int[] destArr = new int[sourceArr.length];
        
        for(int i = 0; i < sourceArr.length; i++) {
            destArr[i] = sourceArr[i];
        }
        
        System.out.println("Source array: " + Arrays.toString(sourceArr));
        System.out.println("Copied array: " + Arrays.toString(destArr));
    }
    
    // 19. Find the frequency of each element of an array
    public void findFrequency() {
        int[] arr = getIntArrayInput();
        // A simple approach for unsorted arrays without using maps
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        System.out.println("Frequency of elements:");
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;
            
            int count = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }
    }
    
    // 20. Print the elements of an array in reverse order
    public void printReverse() {
        int[] arr = getIntArrayInput();
        System.out.println("Array in reverse order:");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // 21. Print elements of an array on even position
    public void printEvenPositionElements() {
        int[] arr = getIntArrayInput();
        System.out.println("Elements at even positions (2nd, 4th, ...):");
        for(int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 22. Print elements of an array on odd position
    public void printOddPositionElements() {
        int[] arr = getIntArrayInput();
        System.out.println("Elements at odd positions (1st, 3rd, ...):");
        for(int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // 23. Print the sum of all elements of an array
    public void sumOfElements() {
        int[] arr = getIntArrayInput();
        int sum = 0;
        for(int val : arr) {
            sum += val;
        }
        System.out.println("Sum of all elements: " + sum);
    }
    
    // 24. Sort elements of an array in ascending order
    public void sortAscending() {
        int[] arr = getIntArrayInput();
        Arrays.sort(arr);
        System.out.println("Array sorted in ascending order: " + Arrays.toString(arr));
    }
    
    // 25. Sort elements of an array in descending order
    public void sortDescending() {
        int[] arr = getIntArrayInput();
        Arrays.sort(arr);
        System.out.println("Array sorted in descending order: ");
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AssignmentArray assignment = new AssignmentArray();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Java 'Array' Assignments Menu ---");
            System.out.println("1. Calculate average value of array");
            System.out.println("2. Test if an array contains a specific value");
            System.out.println("3. Find the index of an array element");
            System.out.println("4. Remove a specific element from an array");
            System.out.println("5. Find the maximum and minimum value of an array");
            System.out.println("6. Reverse an array of integer values");
            System.out.println("7. Find duplicate values in an integer array");
            System.out.println("8. Find duplicate values in a string array");
            System.out.println("9. Find common elements between two string arrays");
            System.out.println("10. Remove duplicate elements from an array");
            System.out.println("11. Find the second largest element in an array");
            System.out.println("12. Find the second smallest element in an array");
            System.out.println("13. Separate even and odd numbers in an array");
            System.out.println("14. Find k largest elements in an array");
            System.out.println("15. Find k smallest elements in an array");
            System.out.println("16. Swap two arrays");
            System.out.println("17. Swap three numbers");
            System.out.println("18. Copy all elements of one array into another");
            System.out.println("19. Find frequency of each element in an array");
            System.out.println("20. Print array in reverse order");
            System.out.println("21. Print elements at even positions");
            System.out.println("22. Print elements at odd positions");
            System.out.println("23. Print sum of all elements in an array");
            System.out.println("24. Sort array in ascending order");
            System.out.println("25. Sort array in descending order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: assignment.calculateAverage(); break;
                case 2: assignment.containsValue(); break;
                case 3: assignment.findIndex(); break;
                case 4: assignment.removeElement(); break;
                case 5: assignment.findMaxAndMin(); break;
                case 6: assignment.reverseArray(); break;
                case 7: assignment.findDuplicateIntegers(); break;
                case 8: assignment.findDuplicateStrings(); break;
                case 9: assignment.findCommonElements(); break;
                case 10: assignment.removeDuplicates(); break;
                case 11: assignment.findSecondLargest(); break;
                case 12: assignment.findSecondSmallest(); break;
                case 13: assignment.separateEvenAndOdd(); break;
                case 14: assignment.findKthLargest(); break;
                case 15: assignment.findKthSmallest(); break;
                case 16: case 26: assignment.swapTwoArrays(); break;
                case 17: case 27: assignment.swapThreeNumbers(); break;
                case 18: assignment.copyArray(); break;
                case 19: assignment.findFrequency(); break;
                case 20: assignment.printReverse(); break;
                case 21: assignment.printEvenPositionElements(); break;
                case 22: assignment.printOddPositionElements(); break;
                case 23: assignment.sumOfElements(); break;
                case 24: assignment.sortAscending(); break;
                case 25: assignment.sortDescending(); break;
                case 0: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
