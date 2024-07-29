
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAX = Integer.parseInt(br.readLine());


        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < MAX; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine(), " ");
            PriorityQueue<Integer> S = new PriorityQueue<>();
            while (st.hasMoreTokens()) {
                S.offer(Integer.parseInt(st.nextToken()));
            }

            st = new StringTokenizer(br.readLine(), " ");
            PriorityQueue<Integer> B = new PriorityQueue<>();
            while (st.hasMoreTokens()) {
                B.offer(Integer.parseInt(st.nextToken()));
            }

            int count = N + M;

            while (count-- > 0) {
                if(S.isEmpty() || B.isEmpty()) {
                    if(!S.isEmpty()){
                        sb.append("S\n");
                    } else {
                        sb.append("B\n");
                    }
                    break;
                }

                if(S.peek().equals(B.peek())) {
                    B.poll();
                } else if(S.peek() > B.peek()) {
                    B.poll();
                } else {
                    S.poll();
                }
            }

        }

        System.out.println(sb.toString().trim());

        br.close();
    }
}