package Generics;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        printList(intArray);
        printList(stringArray);
        printList(doubleArray);
        printList(charArray);

        System.out.println(printFirst(intArray));
        System.out.println(printFirst(doubleArray));
        System.out.println(printFirst(charArray));
        System.out.println(printFirst(stringArray));
    }

    private static <T> void printList(T[] arrayList) {

        for (T t : arrayList) {
            System.out.print(t + " ");

        }
        System.out.println();
    }

    private static <T> T printFirst(T[] arrayList) {

        return arrayList[0];

    }
}
