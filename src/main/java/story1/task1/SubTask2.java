package story1.task1;

import java.util.ArrayList;
import java.util.List;

//Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
public class SubTask2 {

    public int[] getSpecificArray(int[] array) {
        int[] threeDigitNumbersArray = getThreeDigitNumbersArray(array);
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < threeDigitNumbersArray.length; i++) {
            int integer = threeDigitNumbersArray[i];
            boolean checkCondition = isCheckCondition(integer);
            if (checkCondition) {
                integers.add(integer);
            }
        }
        return getInts(integers);
    }

    private int[] getThreeDigitNumbersArray(int[] array) {
        List<Integer> integers = new ArrayList<Integer>();
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
}
