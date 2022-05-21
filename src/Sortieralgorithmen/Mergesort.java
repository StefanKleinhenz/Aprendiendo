package Sortieralgorithmen;

import java.util.Random;


public class Mergesort {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Before: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        mergeSort(array);

        System.out.println();
        System.out.println("After: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }


    }

    private static void mergeSort(int[] array) {
        
        int arrayLength = array.length;
        

        if (arrayLength < 2) {
            return;
        }
        int haftlength = arrayLength / 2;
        int[] left = new int[haftlength];
        int[] right = new int[arrayLength - haftlength];


        for (int i = 0; i < haftlength; i++) {
            left[i] = array[i];
            
        }

        for (int i = haftlength; i < arrayLength; i++) {
            //Wir wollen nicht anfagen, unser Array
            //ab der Mitte zu füllen, wir möchten 
            //von vorne anfangen, deswegen i- haftlenght
            right[i - haftlength] = array[i];

        }

        mergeSort(left);
        mergeSort(right);

        //Merge
        merge(array,left,right);

    }

    private static void merge(int[] array, int[] left, int[] right) {

        int leftLength = left.length;
        int rightLength = right.length;

        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;

            } else {
                array[k] = right[j];
                j++;
            }
            /** 
             * Subimos la posicion en el array que estamos juntando para que 
             * coloque el elemento en el posicion correcta.
             * Por ejemeplo si ya tenemos uno elemento en la posicion 0, queremos
             * que la siguiente vez, coloque al elemento mas peque;o en la posiscion 1
             */
            k++;

        }
        while (i < leftLength) {
            array[k] = left[i];
            i++;
            k++;

        }
        while (j < rightLength) {
            array[k] = right[j];
            j++;
            k++;

        } 



    }

}
