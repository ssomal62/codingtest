

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < MAX; i++) {
            if (i >= 1) {
                sb.append("\n");
            }

            int employees = Integer.parseInt(br.readLine());
            int[] ranks = new int[employees + 1];

            for (int j = 0; j < employees; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int rank1 = Integer.parseInt(st.nextToken());
                int rank2 = Integer.parseInt(st.nextToken());
                ranks[rank1] = rank2;
            }

            int selection = 1;
            int minRank = ranks[1];

            for (int j = 2; j <= employees; j++) {
                if (ranks[j] < minRank) {
                    minRank = ranks[j];
                    selection++;
                }
            }

            sb.append(selection);
        }

        System.out.println(sb.toString());
        br.close();
    }
}