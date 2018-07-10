package util;

import java.util.Random;

public final class ArrayGenerator {

    private static Random random = new Random();

    public static int[] createArray(int size) {
        int[] array = new int[size];
        fillingIn(array);
        return array;
    }

    public static int[] createArray() {
        int[] array = new int[10];
        fillingIn(array);
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    private static void fillingIn(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmpVar = random.nextInt(100);
            array[i] = tmpVar;
        }
    }
}
