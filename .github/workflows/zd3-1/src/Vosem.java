public class Vosem {
    public static void main(String[] args) {
        int[] array = {4, 7, 22, 9, 1, 29, 3, 2};
        rotateArray(array, 3);
        for (int i : array) {
            System.out.print(i + " ");
        }
        }
    public static void rotateArray(int[] array, int n) {
        if (array == null || array.length <= 1 || n == 0) {
            return;
        }
        int length = array.length;
        n = ((n % length) + length) % length;
        for (int i = 0; i < n; i++) {
            int previous = array[length - 1];
            for (int j = 0; j < length; j++) {
                int temp = array[j];
                array[j] = previous;
                previous = temp;
            }
        }
    }
}
