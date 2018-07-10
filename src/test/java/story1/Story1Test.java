package story1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import story1.task1.SubTask1;
import util.ArrayGenerator;

public class Story1Test {

    private SubTask1 subTask1;
    private int[] array;

    @BeforeEach
    public void init() {
        subTask1 = new SubTask1();
        array = ArrayGenerator.createArray();
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
}
