
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int N, M;

    static int[] sequence;

    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];

        generateSequences(0, 1);
        
        System.out.println(result.toString());
        sc.close();
    }

    private static void generateSequences(int depth, int start) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                result.append(sequence[i]).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = start; i <= N; i++) {
            sequence[depth] = i;
            generateSequences(depth + 1, i + 1);
        }
    }

}

