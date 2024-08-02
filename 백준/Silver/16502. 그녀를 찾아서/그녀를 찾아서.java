
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int t = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 소비

        double[][] P = new double[4][4]; // 전이 행렬 초기화
        for (int i = 0; i < M; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int start = storeIndex(edge[0]);
            int end = storeIndex(edge[1]);
            double prob = Double.parseDouble(edge[2]);
            P[start][end] = prob;
        }

        // 초기 상태 벡터 (동일 확률로 시작)
        double[] v = new double[] {0.25, 0.25, 0.25, 0.25};

        // 전이 행렬 t번 곱하기
        for (int i = 0; i < t; i++) {
            v = multiply(v, P);
        }

        // 결과 출력
        for (double prob : v) {
            System.out.printf("%.2f\n", prob * 100);
        }
    }

    // 매장 이름을 인덱스로 변환
    private static int storeIndex(String store) {
        switch (store) {
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            default: throw new IllegalArgumentException("Unknown store: " + store);
        }
    }

    // 벡터와 행렬의 곱셈
    private static double[] multiply(double[] vector, double[][] matrix) {
        double[] result = new double[vector.length];
        Arrays.fill(result, 0.0);

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j] += vector[i] * matrix[i][j];
            }
        }

        return result;
    }
}
