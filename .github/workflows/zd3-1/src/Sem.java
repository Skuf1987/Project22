public class Sem {
    public static void main(String[] args) {
        int[] array = {3, 4, 4, 2, 2, 1, 15, 2};
        System.out.println("checkBalance([3, 4, 4, 2, 2, 1 ||| 15, 2]) - " + checkBalance(array));
    }
    public static boolean checkBalance(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int num : array) {
            leftSum += num;
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}
