
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int numCount = Integer.parseInt(br.readLine());
            long cost = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            PriorityQueue<Long> que = new PriorityQueue<>();

            for(int i = 0; i < numCount; i++) {
                que.offer(Long.parseLong(st.nextToken()));
            }

            while (que.size() > 1) {
                long file1 = que.poll();
                long file2 = que.poll();
                long sum = file1 + file2;
                cost += sum;
                que.offer(sum);
            }

            sb.append(cost).append("\n");
        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}
