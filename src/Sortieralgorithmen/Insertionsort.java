package Sortieralgorithmen;

import java.util.Random;
import java.util.stream.IntStream;

public class Insertionsort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        IntStream.of(numbers).forEach(e -> System.out.print(e + " "));

        insertionsort(numbers);

        System.out.println();
        System.out.println("After: ");
        IntStream.of(numbers).forEach(e -> System.out.print(e + " "));

    }

    public static void insertionsort(int[] numbers) {

        for (int i = 1; i < numbers.length - 1; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {

                numbers[j + 1] = numbers[j];
                j--;

            }
            numbers[j + 1] = temp;

        }

    }
    
}
