public class Chetire {
    public static void main(String[] args) {
        int size = 4;
        int[][] squareArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            squareArray[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
