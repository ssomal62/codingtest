

import java.util.Scanner;

public class Main {
    static final int SIZE = 19;
    static int[][] board = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int[] result = findWinner();
        
        System.out.println(result[0]);
        if (result[0] != 0) {
            System.out.println((result[1] + 1) + " " + (result[2] + 1));
        }

        scanner.close();
    }

    static int[] findWinner() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] != 0) {
                    // 가로 방향 체크
                    if (j <= SIZE - 5 && checkLine(i, j, 0, 1)) {
                        return new int[]{board[i][j], i, j};
                    }
                    // 세로 방향 체크
                    if (i <= SIZE - 5 && checkLine(i, j, 1, 0)) {
                        return new int[]{board[i][j], i, j};
                    }
                    // 대각선 방향 (우하향) 체크
                    if (i <= SIZE - 5 && j <= SIZE - 5 && checkLine(i, j, 1, 1)) {
                        return new int[]{board[i][j], i, j};
                    }
                    // 대각선 방향 (우상향) 체크
                    if (i >= 4 && j <= SIZE - 5 && checkLine(i, j, -1, 1)) {
                        return new int[]{board[i][j], i, j};
                    }
                }
            }
        }
        return new int[]{0, -1, -1};  
    }

    static boolean checkLine(int startX, int startY, int dx, int dy) {
        int color = board[startX][startY];
        for (int i = 1; i < 5; i++) {
            int newX = startX + i * dx;
            int newY = startY + i * dy;
            if (board[newX][newY] != color) {
                return false;
            }
        }

        if (startX - dx >= 0 && startX - dx < SIZE && startY - dy >= 0 && startY - dy < SIZE) {
            if (board[startX - dx][startY - dy] == color) {
                return false;
            }
        }
        if (startX + 5 * dx >= 0 && startX + 5 * dx < SIZE && startY + 5 * dy >= 0 && startY + 5 * dy < SIZE) {
            if (board[startX + 5 * dx][startY + 5 * dy] == color) {
                return false;
            }
        }
        return true;
    }
}