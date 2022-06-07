public class test {

    public static void main(String[] args) {

        int[] intArray = new int[5];

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;

        int[] intArray2 = new int[5];
        intArray2[0] = 6;
        intArray2[1] = 6;
        intArray2[2] = 6;
        intArray2[3] = 6;
        intArray2[4] = 6;


        // intArray = intArray2;

        for (int i : intArray) {
            System.out.println(i);
        }
        System.out.println(intArray);

    }
}
