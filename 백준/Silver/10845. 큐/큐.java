import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int MAX = Integer.parseInt(br.readLine());
        Deque<String> que = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < MAX; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push" :
                    que.add(st.nextToken());
                    break;
                case "pop" :
                    sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(que.isEmpty() ? -1 : que.peekFirst()).append("\n");
                    break;
                case "back" :
                    sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());

        br.close();

    }
}
