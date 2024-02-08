import java.util.Random;
import java.util.Scanner;
public class Odin {
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map = new char[SIZE][SIZE];
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        initializeGame();
        playGame();
        scanner.close();
    }
    public static void initializeGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void playGame() {
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (isVictory(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            } else if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
            computerTurn();
            printMap();
            if (isVictory(DOT_O)) {
                System.out.println("Победил компьютер!");
                break;
            } else if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }
    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static void computerTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static boolean isVictory(char playerSymbol) {
        for (int i = 0; i < SIZE; i++) {
            if ((map[i][0] == playerSymbol && map[i][1] == playerSymbol && map[i][2] == playerSymbol) ||
                    (map[0][i] == playerSymbol && map[1][i] == playerSymbol && map[2][i] == playerSymbol))
                return true;
        }
        if ((map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] == playerSymbol) ||
                (map[0][2] == playerSymbol && map[1][1] == playerSymbol && map[2][0] == playerSymbol))
            return true;

        return false;
    }
    public static boolean isDraw() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }
    public static boolean isCellValid(int x, int y) {
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE && map[y][x] == DOT_EMPTY;
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++)
            System.out.print((i == 0 ? "  " : i + " "));
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

