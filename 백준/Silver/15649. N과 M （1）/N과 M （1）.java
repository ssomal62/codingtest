import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] sequences;
    static boolean[] used;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sequences = new int[M];
        used = new boolean[N + 1];

        generateSequences(0);

        System.out.println(result.toString());
        sc.close();
    }

    private static void generateSequences(int depth) {

        if(depth == M) {
            for (int i = 0; i < M ; i++) {
                result.append(sequences[i]).append(" ");
            }
            result.append("\n");
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(!used[i]){
                used[i] = true;
                sequences[depth] = i;
                generateSequences(depth + 1);
                used[i] = false;
            }
        }
    }
}
