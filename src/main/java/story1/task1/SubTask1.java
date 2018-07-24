package story1.task1;

//Элементы, расположенные методом пузырька по убыванию модулей.
public class SubTask1 {

    public void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (Math.abs(array[i]) < Math.abs(array[i + 1])) {
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}
