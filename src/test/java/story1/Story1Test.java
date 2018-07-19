package story1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import story1.task1.SubTask1;
import story1.task1.SubTask2;
import util.ArrayGenerator;

public class Story1Test {

    private SubTask1 subTask1;
    private SubTask2 subTask2;
    private int[] array;
    private int[] arrayThreeDigitNumbers;
    @BeforeEach
    public void init() {
        subTask1 = new SubTask1();
        subTask2 = new SubTask2();
        array = ArrayGenerator.createArray();
        arrayThreeDigitNumbers = ArrayGenerator.createNumerousArray();
    }

    @Test
    public void bubbleSort() {
        subTask1.bubbleSort(array);
        for (int i = 0; i < array.length - 1; i++) {
            boolean isCheck = false;
            if (array[i] >= array[i + 1]) {
                isCheck = true;
            }
            Assertions.assertTrue(isCheck);
        }
    }

    @Test
    public void subTask2() {
        long x = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000000; j++) {
                subTask2.getSpecificArray(arrayThreeDigitNumbers);
            }
        }
        long y = System.currentTimeMillis();
        System.out.println(y - x);
    }

    @Test
    public void test() {
        long x = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000000; j++) {
                subTask2.filter(arrayThreeDigitNumbers);
            }
        }
        long y = System.currentTimeMillis();
        System.out.println(y - x);
    }
}
