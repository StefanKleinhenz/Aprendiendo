package Sortieralgorithmen;

import java.util.Random;
import java.util.stream.IntStream;

public class Selectionsort {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(100);
        }

        System.out.println("Before: ");
        IntStream.of(numbers).forEach(e->System.out.print(e+ " "));

        selectionSort(numbers);
        System.out.println();
        System.out.println("After ");
        IntStream.of(numbers).forEach(e->System.out.print(e+ " "));

    }
    public static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]) {
                    int temp = numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                    
                }
            }
            
        }
        
    }
    
}
