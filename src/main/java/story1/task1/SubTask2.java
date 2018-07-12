package story1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.

public class SubTask2 {

    public int[] getSpecificArray(int[] array) {
        int[] threeDigitNumbersArray = getThreeDigitNumbersArray(array);
        List<Integer> integers = new ArrayList<>();
        for (int integer : threeDigitNumbersArray) {
            if (isCheckCondition(integer)) {
                integers.add(integer);
            }
        }
        return getInts(integers);
    }

    private int[] getThreeDigitNumbersArray(int[] array) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            int tmp = array[i];
            if (tmp / 100 < 10 && tmp / 100 >= 1) {
                integers.add(tmp);
            }
        }
        return getInts(integers);
    }

    private int[] getInts(List<Integer> list) {
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i);
        }
        return newArray;
    }

    private boolean isCheckCondition(int x) {
        boolean isCheck = false;
        char[] chars = String.valueOf(x).toCharArray();
        if (chars[0] != chars[1] && chars[1] != chars[2] && chars[0] != chars[2]) {
            isCheck = true;
        }
        return isCheck;
    }


    public int[] filter(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(v -> v > 99 && v < 1000)
                .filter(v -> v / 100 != v % 10)
                .filter(v -> v / 100 != v % 100 / 10)
                .filter(v -> v % 100 / 10 != v % 10)
                .toArray();
    }
}
