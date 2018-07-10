package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ArrayGeneratorTest {

    @Test
    public void createArrayWithSize() {
        int[] array = ArrayGenerator.createArray(10);
        Assertions.assertEquals(10, array.length);
    }

    @Test
    public void createArray() {
        int[] array = ArrayGenerator.createArray();
        Assertions.assertEquals(10, array.length);
    }

    @Test
    public void createNumerousArray() {
        int[] array = ArrayGenerator.createNumerousArray();
        Assertions.assertEquals(10, array.length);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void onlyMac() {
    }
}
