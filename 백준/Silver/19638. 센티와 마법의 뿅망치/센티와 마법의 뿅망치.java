
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        final int GIANT_COUNT = Integer.parseInt(st.nextToken());
        final int CENTI = Integer.parseInt(st.nextToken());
        final int MAX_HAMMER = Integer.parseInt(st.nextToken());
        int useHammer = 0;

        PriorityQueue<Integer> giants = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < GIANT_COUNT; i++) {
            giants.offer(Integer.parseInt(br.readLine()));
        }

        while (!giants.isEmpty() && useHammer < MAX_HAMMER) {
            int giant = giants.poll();

            if (giant < CENTI) {
                giants.offer(giant);
                break;
            } else if (giant > 1) {
                giants.offer(giant / 2);
                useHammer++;
            } else {
                giants.offer(1);
                break;
            }
        }

        if (giants.peek() < CENTI) {
            System.out.println("YES\n" + useHammer);
        } else {
            System.out.println("NO\n" + giants.peek());
        }

        br.close();
    }
}
