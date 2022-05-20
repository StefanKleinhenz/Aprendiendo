package Sortieralgorithmen;

import java.util.Random;

public class Quicksort {
	public static void main(String[] args) {

		Random random = new Random();

		int[] numbers = new int[7];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100);

		}

		System.out.println("Before: ");
		printArray(numbers);

		quicksort(numbers);

		System.out.println("After");
		printArray(numbers);

	}

	public static void quicksort(int[] numbers) {

		quicksort(numbers, 0, numbers.length - 1);
	}

	public static void quicksort(int[] numbers, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) {
			return;
		}
		// Das erste Parameter ist das numbers, das zu Sortieren ist.
		// Schritt 1: Pivot auswählen, in diesen Fall, das letzte Element.

		int pivot = numbers[highIndex];

		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		// Lösung mit for schleife, meine Lösung

		if (leftPointer != rightPointer) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[leftPointer] <= pivot && leftPointer != rightPointer) {
					leftPointer++;
				}
				if (numbers[rightPointer] >= pivot && leftPointer != rightPointer) {
					rightPointer--;
				}
				swap(numbers, leftPointer, rightPointer);
			}
		}
		swap(numbers, leftPointer, highIndex);

		quicksort(numbers, lowIndex, leftPointer - 1);
		quicksort(numbers, leftPointer + 1, highIndex);

		// Video Lösung

		// while (leftPointer != rightPointer) {
		//
		// while (numbers[leftPointer] <= pivot && leftPointer != rightPointer) {
		//
		// leftPointer++;
		// }
		//
		// while (numbers[rightPointer] >= pivot && leftPointer != rightPointer) {
		// rightPointer--;
		// }
		//
		// System.out.println("value leftpinter array: " + numbers[leftPointer]);
		// System.out.println("value rightpointer array: " + numbers[rightPointer]);
		// System.out.println();
		// printArray(numbers);
		//
		// swap(numbers, leftPointer, rightPointer);
		// }
		//
		// swap(numbers, leftPointer, highIndex);
		//
		// quicksort(numbers, lowIndex, leftPointer - 1);
		// quicksort(numbers, leftPointer + 1, highIndex);

	}

	public static void swap(int[] numbers, int leftPointer, int rightPointer) {

		int temp = numbers[leftPointer];
		numbers[leftPointer] = numbers[rightPointer];
		numbers[rightPointer] = temp;

	}

	public static void printArray(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}
		System.out.println("\n");

	}

}
