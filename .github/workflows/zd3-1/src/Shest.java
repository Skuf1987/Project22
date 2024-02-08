public class Shest {
    public static void main(String[] args) {
        int[] array = {11, 5, 66, 23, 7, 8};
        MinMax(array);
    }
    public static void MinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
