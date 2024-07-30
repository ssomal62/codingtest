
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = Integer.parseInt(br.readLine());

        Deque<Integer> que = new ArrayDeque<>();

        int size = 0;
        int min = 0;
        for (int i = 0; i < MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            if (st.nextToken().equals("1")) {
                int student = Integer.parseInt(st.nextToken());
                que.offer(student);

                if (size <= que.size()) {
                    if (size < que.size()) {
                        size = que.size();
                        min = student;
                    } else {
                        min = Math.min(min, student);
                    }
                }
            } else {
                que.poll();
            }
        }

        System.out.println(size + " " + min);

        br.close();
    }
}