import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (max-- > 0) {
            int num = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
            String win = "";

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String university = st.nextToken();
                int amount = Integer.parseInt(st.nextToken());
                que.offer(amount);
                if (!que.isEmpty() && que.peek() == amount) {
                    win = university;
                }
            }
            sb.append(win).append("\n");
        }

        System.out.println(sb.toString().trim());

        br.close();
    }

}
