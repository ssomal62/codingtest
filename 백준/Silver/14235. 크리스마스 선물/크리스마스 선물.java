
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> outputGift = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> inputGift = new HashSet<>();

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());

            if (n == 0) {
                sb.append(outputGift.isEmpty() ? -1 : outputGift.poll()).append("\n");
            } else {
                while (st.hasMoreTokens()) {
                    int gift = Integer.parseInt(st.nextToken());
                    outputGift.offer(gift);
                }
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}
