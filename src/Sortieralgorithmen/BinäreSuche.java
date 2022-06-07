package Sortieralgorithmen;

public class BinäreSuche {

    // binary search = Search algorithm that finds the position
    // of a target value within a sorted array.
    // Half of the array is eliminated during each "step"

    public static void main(String[] args) {

        int array[] = new int[100];
        int target = 30;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }

    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = (high + low) / 2;
            int valueMiddle = array[middle];

            System.out.println("middle: " + valueMiddle);

            if (valueMiddle < target)
                low = middle + 1;
            else if (valueMiddle > target)
                high = middle - 1;
            else
                return middle; // target found
        }

        return -1;
    }
}
