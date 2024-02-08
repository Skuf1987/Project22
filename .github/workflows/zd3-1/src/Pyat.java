public class Pyat {
    public static void main(String[] args) {
        int[] resultArray = createArray(2, 9);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
